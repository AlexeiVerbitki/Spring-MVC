<!DOCTYPE html>
<html>

<head>

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/my-test.css">

<script
	src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>

</head>

<body>

	<h2>Spring MVC Demo - Home Page</h2>

	<a href="showForm">Plain Hello World</a>
	<br>
	<a href="student-form">Student Form</a>
	
	<br>
	<a href="customer-form">Customer form</a>
	
	<br>
	<br>
	<a href="ola/Step1">OLA Step1</a>

	<img
		src="${pageContext.request.contextPath}/resources/images/IMG_20170311_115450.jpg" />

	<br>
	<br>

	<input type="button" onclick="doSomeWork()" value="Click Me" />

</body>

</html>