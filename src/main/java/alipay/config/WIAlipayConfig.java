package alipay.config;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *版本：3.3
 *日期：2012-08-10
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
    
 *提示：如何获取安全校验码和合作身份者ID
 *1.用您的签约支付宝账号登录支付宝网站(www.alipay.com)
 *2.点击“商家服务”(https://b.alipay.com/order/myOrder.htm)
 *3.点击“查询合作者身份(PID)”、“查询安全校验码(Key)”

 *安全校验码查看时，输入支付密码后，页面呈灰色的现象，怎么办？
 *解决方法：
 *1、检查浏览器配置，不让浏览器做弹框屏蔽设置
 *2、更换浏览器或电脑，重新登录查询。
 */

public class WIAlipayConfig {

    // ↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    // 合作身份者ID，以2088开头由16位纯数字组成的字符串
    public static String service = "mobile.securitypay.pay";

    public static String payment_type = "1";

    public static String it_b_pay = "30m";

    public static String partner = "2088021272648125";

    public static String sell_id = "company@cndwine.com";

    // 商户的私钥
    public static String private_key = "MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBANuL88MoX+8uF9NECsvngdhVocHRLsWxe06CcawfazxYR5c+4Ps89emCZ5BXqlRjB3aME9qtFX1ZHmxj3vphj1cJcysipu4KNrur1fMVPjy9lWofNMzi8M3n2RfTepnuc4QaOjdI2fZsxlH/nmxl8xvO/4jNoEkijcDQnxE2BKrbAgMBAAECgYEAosgR5RF6kAzM/YfluWndjFlxphNDarE9i+iL/+MLz6Jk8m9cwOtiKdDWmN9nG0qRrgQOdIUA+f+p3xPtsBfF/pKfyEUhnpcZmhVEYm8t8NNQI9EC1pdc7kPpbgokQSPvm/jUTpzplH8s77ZJ+IpSTIG6pXrhfb2wHJ5WxMAhSYECQQD6Rz3wt+RTznPo3HJt8VWbmK2GYyh7DVtTMu/ZgCENJ8lqZlGdMVBZ6tDbDbmJMT1cnfhE66k71K3fydglor9fAkEA4JDaXyW5lmq39mbgDiMCRMuj5JBb3AbSP+SxGoDyDR/lodVgDv92vR+JDKi6gqys3GKJwupxYB4A6PnKRAXSBQJASUACm+pmVDTvba7fetgQUyrbVqK83U7qdK5KzqCWi9AiPhbWOiiNuNNl70bUD5guumWtnRZQAKfdf8sGjPVWBwJBAJZahcrksEB0jV0NfgAZEoDLM51pxgcoDgc3cBiFswp0i8Px4BHKm05+2by/D7lEMayQ0RnO7D/ldsiFzhYDK50CQQCvrMlbl/Oy+SgSrw/8GVp4cDMCmp7uZ2yYupt0XqqjZSHwAeUb0rCuZI8YMntbHEc2Pp8OX22Zz/47BpVBtbpM";

    // 支付宝的公钥
    public static String ali_public_key = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCnxj/9qwVfgoUh/y2W89L6BkRAFljhNhgPdyPuBV64bfQNN1PjbCzkIM6qRdKBoLPXmKKMiFYnkd6rAoprih3/PrQEB/VsW8OoM8fxn67UDYuyBTqA23MML9q1+ilIZwBC2AQ2UBVOrFXfFl75p6/B5KsiNG9zpgmLCUYuLkxpLQIDAQAB";

    // ↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    // 调试用，创建TXT日志文件夹路径
    public static String log_path = "C:\\";

    // 字符编码格式 目前支持 gbk 或 utf-8
    public static String input_charset = "utf-8";

    // 签名方式 不需修改
    public static String sign_type = "RSA";

    // 异步通知访问地址URL
    public static String notify_url = "http://www.cndwine.com/paynotify/alipay/notify_url.aspx";

    public static String xm_corpcode = "00002034";

    public static String xm_partner = "2088021272648125";

    public static String xm_sell_id = "company@cndwine.com";

    public static String xm_private_key = "MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBANuL88MoX+8uF9NECsvngdhVocHRLsWxe06CcawfazxYR5c+4Ps89emCZ5BXqlRjB3aME9qtFX1ZHmxj3vphj1cJcysipu4KNrur1fMVPjy9lWofNMzi8M3n2RfTepnuc4QaOjdI2fZsxlH/nmxl8xvO/4jNoEkijcDQnxE2BKrbAgMBAAECgYEAosgR5RF6kAzM/YfluWndjFlxphNDarE9i+iL/+MLz6Jk8m9cwOtiKdDWmN9nG0qRrgQOdIUA+f+p3xPtsBfF/pKfyEUhnpcZmhVEYm8t8NNQI9EC1pdc7kPpbgokQSPvm/jUTpzplH8s77ZJ+IpSTIG6pXrhfb2wHJ5WxMAhSYECQQD6Rz3wt+RTznPo3HJt8VWbmK2GYyh7DVtTMu/ZgCENJ8lqZlGdMVBZ6tDbDbmJMT1cnfhE66k71K3fydglor9fAkEA4JDaXyW5lmq39mbgDiMCRMuj5JBb3AbSP+SxGoDyDR/lodVgDv92vR+JDKi6gqys3GKJwupxYB4A6PnKRAXSBQJASUACm+pmVDTvba7fetgQUyrbVqK83U7qdK5KzqCWi9AiPhbWOiiNuNNl70bUD5guumWtnRZQAKfdf8sGjPVWBwJBAJZahcrksEB0jV0NfgAZEoDLM51pxgcoDgc3cBiFswp0i8Px4BHKm05+2by/D7lEMayQ0RnO7D/ldsiFzhYDK50CQQCvrMlbl/Oy+SgSrw/8GVp4cDMCmp7uZ2yYupt0XqqjZSHwAeUb0rCuZI8YMntbHEc2Pp8OX22Zz/47BpVBtbpM";

    public static String xm_notify_url = "http://www.cndwine.com/paynotify/xmalipay/notify_url.aspx";

    public static String bj_corpcode = "00002037";

    public static String bj_partner = "";

    public static String bj_sell_id = "";

    public static String bj_private_key = "";

    public static String bj_notify_url = "http://www.cndwine.com/paynotify/alipay/bj_notify_url.aspx";

    public static String sh_corpcode = "00002040";

    public static String sh_partner = "";

    public static String sh_sell_id = "";

    public static String sh_private_key = "";

    public static String sh_notify_url = "http://www.cndwine.com/paynotify/alipay/sh_notify_url.aspx";

    // 支付宝多法人账号信息
    public static enum wi_corp_account {
        // 分别为 部门内码; 支付宝partnerid; sell_id; private_key;
        XM(xm_corpcode, xm_partner, xm_sell_id, xm_private_key, xm_notify_url), BJ(bj_corpcode, bj_partner, bj_sell_id,
                bj_private_key, bj_notify_url), SH(sh_corpcode, sh_partner, sh_sell_id, sh_private_key, sh_notify_url);

        private String _corpcode;

        private String _partner;

        private String _sell_id;

        private String _private_key;

        private String _notify_url;

        wi_corp_account(String corpcode, String partner, String sell_id, String private_key, String notify_url) {
            this._corpcode = corpcode;
            this._partner = partner;
            this._sell_id = sell_id;
            this._private_key = private_key;
            this._notify_url = notify_url;
        }

        public String CorpCode() {
            return _corpcode;
        }

        public String Partner() {
            return _partner;
        }

        public String SellID() {
            return _sell_id;
        }

        public String PrivateKey() {
            return _private_key;
        }

        public String Notify_url() {
            return _notify_url;
        }

        public static wi_corp_account typeOf(String Value) {
            switch (Value) {
            case "00002034":
                return XM;
            case "00002037":
                return BJ;
            case "00002040":
                return SH;
            default:
                return null;
            }
        }
    }

}
