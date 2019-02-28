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
<s:url value="/static/css/bootstrap.min.css" var="url_bootstrapcss"></s:url>
<link rel="stylesheet" href="${url_bootstrapcss}">
<s:url value="/static/css/style.css" var="url_stylecss"></s:url>
<link rel="stylesheet" href="${url_stylecss}">
</head>
<body>

<body>
	<%@include file="commons/navigation.jsp"%>
	<div class="container">
		<h2>About Us</h2>
		<hr>

		<!-- about page content -->

		<div class="row">
			<div class="col-md-4">
				<h2>Services</h2>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed
					do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut
					enim ad minim veniam, quis nostrud exercitation ullamco laboris
					nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in
					reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
					pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
					culpa qui officia deserunt mollit anim id est laborum</p>
				<button class="btn btn-default btn-block">Read More</button>
			</div>
			<div class="col-md-4">
				<h2>Products</h2>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed
					do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut
					enim ad minim veniam, quis nostrud exercitation ullamco laboris
					nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in
					reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
					pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
					culpa qui officia deserunt mollit anim id est laborum</p>
				<button class="btn btn-default btn-block">Read More</button>
			</div>
			<div class="col-md-4">
				<h2>Technologies</h2>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed
					do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut
					enim ad minim veniam, quis nostrud exercitation ullamco laboris
					nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in
					reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
					pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
					culpa qui officia deserunt mollit anim id est laborum</p>
				<button class="btn btn-default btn-block">Read More</button>
			</div>
		</div>
		<hr>
	</div>
<%-- Spring  - Link Preparation --%>
	<s:url value="/static/js/jquery-3.3.1.min.js" var="url_jquery" />
	<s:url value="/static/js/bootstrap.min.js" var="url_bootstrapjs" />

	<jsp:include page="commons/foot.jsp" />
	<script src="${url_jquery}"></script>
	<script src="${url_bootstrapjs}"></script>

</body>
</html>