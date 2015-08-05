package alipay.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import alipay.bean.Order;
import alipay.config.AlipayConfig;
import alipay.util.AlipayNotify;
import alipay.util.AlipaySubmit;

import com.sun.jersey.spi.resource.Singleton;

/**
 * �ύ������֧��������
 * 
 * @author Administrator
 * 
 */
@Controller
@Singleton
//Spring�����ÿһ��request���������µ�Jersey������ʵ�����˷�������Ҫ����Spring RequsetContextListener
@Scope("prototype")
@Path(value = "/alipay")
public class AlipayController {
    
    /**
     * <pre>
     * ���������Ա���HTML��ʽ���죨Ĭ�ϣ�
     * 
     * [form id="alipaysubmit" name="alipaysubmit" action="https://mapi.alipay.com/gateway.do?_input_charset=gbk" method="get"]
     *     [input type="hidden" name="payment_type" value="1"/]
     *     [input type="hidden" name="_input_charset" value="gbk"/]
     *     [input type="hidden" name="service" value="create_direct_pay_by_user"/]
     *     [input type="hidden" name="sign" value="1ac2d93ba7132130e85c15abfbeeb0eb"/]
     *     [input type="hidden" name="return_url" value="http://�̻����ص�ַ/create_direct_pay_by_user-JAVA-GBK/return_url.jsp"/]
     *     [input type="hidden" name="notify_url" value="http://�̻����ص�ַ/create_direct_pay_by_user-JAVA-GBK/notify_url.jsp"/]
     *     [input type="hidden" name="sign_type" value="MD5"/]
     *     [input type="submit" value="ȷ��" style="display:none;"]
     * [/form]
     * [script]document.forms['alipaysubmit'].submit();[/script]
     * 
     * </pre>
     */
    @Path(value = "/deposit")
    @POST
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String deposit(@Context
    HttpServletRequest request, @Context
    HttpServletResponse response, @FormParam(value = "order")
    Order order) throws Exception {
        Map<String, String> sParaTemp = new HashMap<String, String>();
        sParaTemp.put("partner", AlipayConfig.PARTNER);//֧����PID
        sParaTemp.put("_input_charset", AlipayConfig.INPUT_CHARSET);//ͳһ����
        sParaTemp.put("seller_email", AlipayConfig.SELLER_EMAIL);//����֧�����˺�
        
        sParaTemp.put("service", "create_direct_pay_by_user");//�ӿڷ���----��ʱ����
        sParaTemp.put("payment_type", "1");//֧������----��Ʒ���͹���
        sParaTemp.put("notify_url", "http://localhost:8080/zhifubao/alipay/asyncNotify");//�������첽֪ͨҳ��·�� ����http://��ʽ������·�������ܼ�?id=123�����Զ������
        sParaTemp.put("return_url", "http://localhost:8080/zhifubao/alipay/syncNotify");//ҳ����תͬ��֪ͨҳ��·�� ����http://��ʽ������·�������ܼ�?id=123�����Զ������������д��http://localhost/
        sParaTemp.put("show_url", "http://localhost:8080/zhifubao/show.jsp");//��Ʒչʾ��ַ������http://��ͷ������·�������磺http://www.xxx.com/myorder.html
        sParaTemp.put("anti_phishing_key", AlipaySubmit.query_timestamp());// ������ʱ��� ����Ҫʹ����������ļ�submit�е�query_timestamp����
        sParaTemp.put("exter_invoke_ip", "127.0.0.1");//�ͻ��˵�IP��ַ���Ǿ�����������IP��ַ���磺221.0.0.1
        
        sParaTemp.put("out_trade_no", order.getOrderId());//�������
        sParaTemp.put("subject", order.getOrderName());//��������
        sParaTemp.put("total_fee", order.getPrice().toString());//�����۸�
        sParaTemp.put("body", order.getContent());//��������
        
        
        //��������
        try {
            String sHtmlText = AlipaySubmit.buildRequest(sParaTemp, "post", "ȷ��");
            return sHtmlText;
        } catch (Exception e) {
            String result = "{\"success\":false,\"msg\":\"��תʧ�ܣ����Ժ����ԣ�\"}";
            return result;
        }
    }
    
    /**
     * ͬ��֪ͨ��ҳ���Controller
     * 
     * @param request
     * @param response
     * @return
     */
    @Path(value = "syncNotify")
    @POST
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String syncNotify(@Context
    HttpServletRequest request, @Context
    HttpServletResponse response) {
        return "return_url.jsp";
    }
    
    /**
     * �첽֪ͨ����״̬��Controller
     * 
     * @param request
     * @param response
     * @return
     */
    @Path(value = "asyncNotify")
    @POST
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String asyncNotify(@Context
    HttpServletRequest request, @Context
    HttpServletResponse response) {
        Map<String, String> params = new HashMap<String, String>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String)iter.next();
            String[] values = (String[])requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
            }
            params.put(name, valueStr);
        }
        String tradeNo = request.getParameter("out_trade_no");
        String tradeStatus = request.getParameter("trade_status");
        //String notifyId = request.getParameter("notify_id");  
        if (AlipayNotify.verify(params)) {
            //��֤�ɹ�
            if (tradeStatus.equals("TRADE_FINISHED") || tradeStatus.equals("TRADE_SUCCESS")) {
                //Ҫд���߼����Լ����Լ���Ҫ��д
                System.out.println(">>>>>��ֵ�ɹ�" + tradeNo);
            }
            return "notify_url.jsp";
        } else {
            //��֤ʧ��  
            return "fail.jsp";
        }
        
    }
}