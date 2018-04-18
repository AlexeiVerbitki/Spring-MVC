<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html>
<head>

<title>Student Registration form</title>

</head>


<body>

	<form:form action="processStudent" modelAttribute="student">
		
		First name: <form:input path="firstName" />

		<br>
		<br>
	
		Last name: <form:input path="lastName" />

		<br>
		<br>
		
		Age:       <form:input path="age" />

		<br>
		<br>
		
		Country: <form:select path="country">
			<form:options items="${student.countryOptions}" />

			<br>
			<br>
			
		Language: <form:radiobuttons path="favoriteLanguage"
				items="${student.languageRadioButtons }" />

		</form:select>

		<br>
		<br>
		
		Operating System: 
		<form:checkboxes path="operatingSystemsArray"
				items="${student.operatingSystemsMap }"/>

		<input type="submit" value="Submit" />
	</form:form>

</body>

</html>