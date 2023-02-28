<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//request.setatttribute 로 전달된 값은 request.getattribute로 받음
//*중요* 들어오는 데이터타입은 object타입이기 때문에 받는 타입으로 반드시 형변화처리 필요 
int result=(int)request.getAttribute("result");

%>
</body>
</html>