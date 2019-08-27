<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>成功</h1>
	<a href="spring/method">method</a>
	<form action="spring/method" method="post">
		<input name="userName" /> <input name="password" /> <input
			type="submit">
	</form>
	<form action="spring/params" method="get">
		<input name="userName" /> <input name="password" /> <input
			type="submit">
	</form>
	<a href="spring/headers">headers</a>
	<br />
	<a href="spring/url/123">url</a>
	<br />
	<a href="spring/requestParam?idt=678">requestParam</a>
	<br />
	<a href="spring/requestHeader">requestHeader</a>
	<br />
	<a href="spring/requestCookie">requestCookie</a>
	<br />
	<form action="spring/requestPojo" method="post">
		<input name="userName" /> <input name="password" /><input
			name="address.name"> <input type="submit">
	</form>
	<br />
	<a href="spring/servletApi">servletApi</a>
	<br />
	<a href="model/modelAndView">modelAndView</a>
	<br />
	<a href="model/model">model</a>
	<br />
	<a href="model/map">map</a>
	<br />
	<form action="model/modelAttribute" method="post">
		<input name="userName" /> <input name="password" /><input
			name="address.name"> <input type="submit">
	</form>
	<br />
	<a href="redirectMapping">redirectMapping</a>
	<br />
	<form action="personFormat" method="post">
		<input name="userName" /> <input name="password" /> <input type="submit">
	</form>
	
	<br />
	<a href="i18n?locale=zh_CH">zh_CH</a>
	<br />
	<a href="i18n?locale=en_US">en_US</a>
	
	<br />
	<form action="upload" method="post"  enctype="multipart/form-data">
		<input name="userName" /> 
<input type="file" name="file">
<input type="submit">
	</form>
</body>
</html>