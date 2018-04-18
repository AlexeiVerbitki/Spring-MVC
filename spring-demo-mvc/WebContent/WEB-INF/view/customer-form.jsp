<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html>

<head>
<title>Customer Registration form</title>
</head>

<body>

<form:form action="processCustomer" modelAttribute="customer">

First Name: <form:input path="firstName"/>
<form:errors path="firstName" cssClass="error"/>
<br>

Last Name: <form:input path="lasttName"/>
<form:errors path="lasttName" cssClass="error"/>
<br>

Passes: <form:input path="passes"/>
<form:errors path="passes" cssClass="error"/>
<br>

Postal code: <form:input path="postalCode"/>
<form:errors path="postalCode" cssClass="error"/>
<br>

<input type="submit" value="Submit" />

</form:form>


</body>


</html>