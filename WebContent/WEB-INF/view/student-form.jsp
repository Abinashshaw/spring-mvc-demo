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

Favourite Programming language :
<br> 

<%-- <form:radiobutton path="favouriteLanguage" value="Java"/> Java
<form:radiobutton path="favouriteLanguage" value="C#"/> C#
<form:radiobutton path="favouriteLanguage" value="PHP"/> PHP 
<form:radiobutton path="favouriteLanguage" value="Ruby"/> Ruby --%>

<form:radiobuttons path="favouriteLanguage" items="${theFavouriteLanguageOptions}"/>

<br><br>
Operating Systems :
<br>
<%-- <form:checkbox path="operatingSystems" value="Linux"/> Linux
<form:checkbox path="operatingSystems" value="Mac OS"/> Mac OS
<form:checkbox path="operatingSystems" value="MS Windows"/> MS Windows --%>

<form:checkboxes path="operatingSystems" items="${theOperatingSystemsOptions}"/>

<br><br>
<input type="submit" value="submit" />

</form:form>
</body>
</html>