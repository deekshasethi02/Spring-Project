<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PhoneBook App</title>
<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
<!-- Spring link preparation -->
<s:url value="../static/css/bootstrap.min.css" var="url_bootstrapcss"></s:url>
<link rel="stylesheet" href="${url_bootstrapcss}">
<s:url value="../static/css/style.css" var="url_stylecss"></s:url>
<link rel="stylesheet" href="${url_stylecss}">

</head>
<body>
	<%@include file="../commons/navigation.jsp"%>
admin dashboard
<jsp:include page="../commons/foot.jsp" />
</body>
</html>