<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>

<!Doctype !html>
<html>
<head>
<title>Student Registration Page</title>
</head>
<body>
<form:form action="processForm" modelAttribute = "student">

first Name : <form:input path = "firstName" />
<br><br>
last Name : <form:input path = "lastName" />
<br><br>

Country:

<form:select path="country">
	
	<form:options items="${theCountryOptions}" />
	
</form:select>

<br><br>
<input type="submit" value="submit" />

</form:form>
</body>
</html>