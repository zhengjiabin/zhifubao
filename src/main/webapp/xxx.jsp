<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UFT-8">
<title>Insert title here</title>
</head>
<body>
	<form id="alipaysubmit" name="alipaysubmit" action="https://mapi.alipay.com/gateway.do?_input_charset=utf-8" method="get">
		<input type="hidden" name="sign" value="GDVXc8pF2fzB3QoTG7sYb2a1iJMFR2OcqDapBuHYj9kjE1yOViVhxE5WPOAtFVziKfBrOy0ZYpOd7ylmbiqRyl02Nkl9uR79JVQeFPqgDMv3B3TUXfPHD5KQT/3fSQELAB3tlmmV7TsZ0s5EcS7Kj4IZ2q4sfbXqX479XZPVu7o=" />
		<input type="hidden" name="body" value="ces" />
		<input type="hidden" name="_input_charset" value="utf-8" />
		<input type="hidden" name="it_b_pay" value="30m" />
		<input type="hidden" name="total_fee" value="0.01" />
		<input type="hidden" name="subject" value="ceshi" />
		<input type="hidden" name="sign_type" value="RSA" />
		<input type="hidden" name="service" value="mobile.securitypay.pay" />
		<input type="hidden" name="notify_url" value="http://127.0.0.1:8080/zhifubao/service/alipay/asyncNotify" />
		<input type="hidden" name="seller_id" value="2088021272648125" />
		<input type="hidden" name="partner" value="2088021272648125" />
		<input type="hidden" name="out_trade_no" value="001" />
		<input type="hidden" name="payment_type" value="1" />
		<input type="hidden" name="return_url" value="http://127.0.0.1:8080/zhifubao/service/alipay/syncNotify" />
		<input type="submit" value="确认" style="display: none;">
	</form>
	<script>
		document.forms['alipaysubmit'].submit();
	</script>
</body>
</html>