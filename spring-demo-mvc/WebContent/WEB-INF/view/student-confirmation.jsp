<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
<head>

<title>Student Confirmation page</title>

</head>
<body>
 
 Congratulations ${student.lastName } ${student.firstName }, ${student.age } ${student.country }
 <br>
 
 You have been successfully confirmed for a ${student.favoriteLanguage} course!
 <br>
 
 The operating systems available are:
 <ul>
 		<c:forEach var="element" items="${student.operatingSystemsArray}">
 		<li> ${element} </li>
 		</c:forEach> 

 </ul>
 
 


 
</body>

</html>