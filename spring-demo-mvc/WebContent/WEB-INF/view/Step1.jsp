<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html>
<head>
<title>Step 1 OLA</title>
</head>
<body>


	<form:form action="navigateStep2" modelAttribute="ola">



Prefix: <form:select path="prefix">
			<form:options items="${ola.prefixMap}" />
		</form:select>
		<br>
First name: <form:input path="firstName" />
		<br>
Middle name: <form:input path="middleName" />
		<br>
Last name: <form:input path="lastName" />
		<br>
Suffix  <form:select path="suffix">
			<form:options items="${ola.suffixMap}" />
		</form:select>
		<br>
Email: <form:input path="email" />
		<br>
Re-enter email: <form:input path="emailReEnter" />
		<br>
		<br>
Phone number: <form:input path="number" /> Ext. <form:input path="ext" />
		<br>
		<br>
I have a non-U.S. phone number. <form:checkbox path="nonUSnumber"
			value="true" />
		<br>
		<br>
----------------------------------------------------<br>
Citizenship status <br>
		<br>
		<form:radiobuttons path="citizenship" items="${ola.citizenshipMap}" />
		<br>
		<br>
Account types: <form:radiobuttons path="accountType"
			items="${ola.accountTypeMap}" />
		<br>
		<br>
At this time, I primarily expect to: <br>
		<form:radiobuttons path="tradingType" items="${ola.tradingTypeMap}" />
		<br>
		<br>
Are you new to investing? (optional) <br>
		<form:radiobuttons path="newToInvesting"
			items="${ola.newToInvestingMap }" />
		<br>
		<br>
			
Agree to Privacy Statement: <form:checkbox path="privacyStatement"
			value="true" />
		<br>
		<br>
		<input type="submit" value="Continue" />
	</form:form>

</body>
</html>