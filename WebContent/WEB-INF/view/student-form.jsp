<%@ taglib prefix = "form" uri ="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registraiton Form</title>
</head>
<body>
	<form:form action = "processForm" modelAttribute = "student">
	
		First Name = <form:input path = "firstName" />
		<br><br>
		Last Name = <form:input path = "lastName" />
		<br><br>
		<br><br>
		
		Country:
		<form:select path ="country">
			<form:options items  ="${student.countryOptions}" />
			
			
		</form:select>
		<br><br>
		
		Favorite language:
		 Java <form:radiobutton path = "favoriteLanguage" value = "Java" />
		 C# <form:radiobutton path = "favoriteLanguage" value = "C#" />
		 Python <form:radiobutton path = "favoriteLanguage" value = "Python" />
		 PHP <form:radiobutton path = "favoriteLanguage" value = "PHP" />
		
		<br><br>
		
		Operating systems:
		Linux <form:checkbox path = "operatingSystems" value = "Linux" />
		Mac OS <form:checkbox path = "operatingSystems" value = "Mac OS" />
		 MS Windows <form:checkbox path = "operatingSystems" value = "MS Windows" />
		
		
		<input type = "submit" value = "submit" />
	</form:form>
</body>
</html>