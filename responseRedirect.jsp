<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>responseRedirect</title>
<script type="../include/jquery-3.6.3.min.js"></script>
</head>
<body>
<%
request.setAttribute("name", "김철수");
//한글, 특수문자를 넘기고 싶을때 사용
String name=URLEncoder.encode("김철수","utf-8");

//forward방식과는 달리 response.sendredirect(url)은 get방식으로 페이지 이동
//get방식, queryString방식 : url?변수=값
response.sendRedirect("responseRedirected.jsp?name="+name+"&age=20");

%>
</body>
</html>