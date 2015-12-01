package alipay.config;

/**
 * <pre>
 * 类名：AlipayConfig
 * 功能：基础配置类
 * 详细：设置帐户有关信息及返回路径
 * 版本：3.3
 * 日期：2012-08-10
 * 说明：
 * 以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 * 该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 * 	
 * 提示：如何获取安全校验码和合作身份者ID
 * 1.用您的签约支付宝账号登录支付宝网站(www.alipay.com)
 * 2.点击“商家服务”(https://b.alipay.com/order/myOrder.htm)
 * 3.点击“查询合作者身份(PID)”、“查询安全校验码(Key)”
 * 
 * 安全校验码查看时，输入支付密码后，页面呈灰色的现象，怎么办？
 * 解决方法：
 * 1、检查浏览器配置，不让浏览器做弹框屏蔽设置
 * 2、更换浏览器或电脑，重新登录查询。
 * </pre>
 */

public class AlipayConfig {
    
    //↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    // 合作身份者ID，以2088开头由16位纯数字组成的字符串
    public static final String PARTNER = "2088021272648125";
    
    /********************************** seller_id>seller_account_name>seller_email */
    // 收款支付宝账号
    public static final String SELLER_EMAIL = "company@cndwine.com";
    
    // 收款支付宝用户号
    public static final String SELLER_ID = "2088021272648125";
    
    // 收款别名支付宝账号
    public static final String SELLER_ACCOUNT_NAME = "";
    
    /**********************************       */
    
    // 商户的私钥
    public static final String PRIVATE_KEY = "MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBANuL88MoX+8uF9NECsvngdhVocHRLsWxe06CcawfazxYR5c+4Ps89emCZ5BXqlRjB3aME9qtFX1ZHmxj3vphj1cJcysipu4KNrur1fMVPjy9lWofNMzi8M3n2RfTepnuc4QaOjdI2fZsxlH/nmxl8xvO/4jNoEkijcDQnxE2BKrbAgMBAAECgYEAosgR5RF6kAzM/YfluWndjFlxphNDarE9i+iL/+MLz6Jk8m9cwOtiKdDWmN9nG0qRrgQOdIUA+f+p3xPtsBfF/pKfyEUhnpcZmhVEYm8t8NNQI9EC1pdc7kPpbgokQSPvm/jUTpzplH8s77ZJ+IpSTIG6pXrhfb2wHJ5WxMAhSYECQQD6Rz3wt+RTznPo3HJt8VWbmK2GYyh7DVtTMu/ZgCENJ8lqZlGdMVBZ6tDbDbmJMT1cnfhE66k71K3fydglor9fAkEA4JDaXyW5lmq39mbgDiMCRMuj5JBb3AbSP+SxGoDyDR/lodVgDv92vR+JDKi6gqys3GKJwupxYB4A6PnKRAXSBQJASUACm+pmVDTvba7fetgQUyrbVqK83U7qdK5KzqCWi9AiPhbWOiiNuNNl70bUD5guumWtnRZQAKfdf8sGjPVWBwJBAJZahcrksEB0jV0NfgAZEoDLM51pxgcoDgc3cBiFswp0i8Px4BHKm05+2by/D7lEMayQ0RnO7D/ldsiFzhYDK50CQQCvrMlbl/Oy+SgSrw/8GVp4cDMCmp7uZ2yYupt0XqqjZSHwAeUb0rCuZI8YMntbHEc2Pp8OX22Zz/47BpVBtbpM";
    
    // 支付宝的公钥
    public static String ALI_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCnxj/9qwVfgoUh/y2W89L6BkRAFljhNhgPdyPuBV64bfQNN1PjbCzkIM6qRdKBoLPXmKKMiFYnkd6rAoprih3/PrQEB/VsW8OoM8fxn67UDYuyBTqA23MML9q1+ilIZwBC2AQ2UBVOrFXfFl75p6/B5KsiNG9zpgmLCUYuLkxpLQIDAQAB";
    
    //↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
    
    // 调试用，创建TXT日志文件夹路径
    public static final String LOG_PATH = "D:/temp";
    
    // 字符编码格式 目前支持 gbk 或 utf-8
    public static final String INPUT_CHARSET = "utf-8";
    
    // 签名方式 不需修改(DSA、RSA、MD5)
    public static final String SIGN_TYPE = "RSA";
    
    //接口服务--(create_direct_pay_by_user：即时到账交易接口，移动支付接口：mobile.securitypay.pay)
    public static final String SERVICE = "mobile.securitypay.pay";
    
    //支付类型----（1：商品类型购买，4：捐赠，47：电子卡券）
    public static final String PAYMENT_TYPE = "1";
    
    //服务器异步通知页面路径
    public static final String NOTIFY_URL = "http://127.0.0.1:8080/zhifubao/service/alipay/asyncNotify";
    
    //页面跳转同步通知页面路径
    public static final String RETURN_URL = "http://127.0.0.1:8080/zhifubao/service/alipay/syncNotify";
    
    //商品展示地址
    public static final String SHOW_URL = "http://127.0.0.1:8080/zhifubao/show.jsp";
    
    //服务器异步通知错误页面路径（需开通此功能）
    public static final String ERROR_NOTIFY_URL = "";
    
    //客户端的IP地址
    public static final String EXTER_INVOKE_IP = "127.0.0.1";
    
    //默认支付方式(creditPay：信用支付，directPay：余额支付（默认）)
    public static final String PAYMETHOD = "directPay";
    
}
