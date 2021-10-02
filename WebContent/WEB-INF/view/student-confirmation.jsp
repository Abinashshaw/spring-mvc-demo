<%@  taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!Doctype !html>
<html>
<head>
<title>Student Registration Page</title>
</head>
<body>
The Student is confirmed : ${student.firstName} ${student.lastName}

<br><br>

Country : ${student.country}

<br><br>

Favourite Language : ${student.favouriteLanguage}

<br><br>

<%-- Operating System(s) : ${student.operatingSystems} --%>

Operating System(s) :
<ul>
	<c:forEach var = "temp" items = "${student.operatingSystems}">
		<li>${temp}</li>
	</c:forEach>
</ul>

</body>
</html>