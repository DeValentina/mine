<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>registerPro</title>
<script type="../include/jquery-3.6.3.min.js"></script>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="registerBean" class="ch05.RegisterBean">
 <jsp:setProperty name="registerBean" property="*"/>
 </jsp:useBean>
 
 
 



</body>
</html>