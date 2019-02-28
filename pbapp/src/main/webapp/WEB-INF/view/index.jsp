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
<%@include file="commons/navigation.jsp"%>
<!-- Main section start -->
<div class="container">

	<div class="row">
		<div class="col-md-12">
			<div class="jumbotron">
				<h2>
					<i class="fas fa-desktop"></i> Welcome in PhoneBook App</h2>
				<p class="lead">This is a PhoneBook app. It is developed in
					Spring, JSP, HTML, CSS,JS and Bootstrap</p>
				<button class="btn btn-warning">Join Us</button>
			</div>
		</div>
	</div>
	<!-- end row -->


	<div class="row">
		<!-- Posts -->
		<div class="col-md-12">


			<div class="post">
				<h3>Heading</h3>
				<p>Lorem Ipsum is simply dummy text of the printing and
					typesetting industry. Lorem Ipsum has been the industry's standard
					dummy text ever since the 1500s, when an unknown printer took a
					galley of type and scrambled it to make a type specimen book. It
					has survived not only five centuries, but also the leap into
					electronic typesetting, remaining essentially unchanged. It was
					popularised in the 1960s with the release of Letraset sheets
					containing Lorem Ipsum passages, and more recently with desktop
					publishing software like Aldus PageMaker including versions of
					Lorem Ipsum.</p>
				<a href="" class="btn btn-primary btn-sm">Read More</a>
			</div>
			<hr>


		</div>


	</div>
	<!-- end posts row -->

</div>
<!-- end main section -->
<%-- Spring  - Link Preparation --%>
	<s:url value="/static/js/jquery-3.3.1.min.js" var="url_jquery" />
	<s:url value="/static/js/bootstrap.min.js" var="url_bootstrapjs" />

	<jsp:include page="commons/foot.jsp" />
	<script src="${url_jquery}"></script>
	<script src="${url_bootstrapjs}"></script>

</body>
</html> 