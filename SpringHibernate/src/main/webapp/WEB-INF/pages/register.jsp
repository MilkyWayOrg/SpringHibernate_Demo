<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
<h1>${regMsg }</h1>
<%-- <f:form action="/SpringHibernate/register" method="post" modelAttribute="user">
<f:hidden path="id"/>
<f:label for="user_name" path="userName">User Name</f:label>
<f:input type="text"  path="userName" id="user_name" required="Required"/><br/>
<f:label for="password" path="password">Password</f:label>
<f:input type="password" path="password" id="password" required="Required"/><br/>
<input type="submit" value="Register"/>
</f:form> --%>
<f:form action="/SpringHibernate/register" method="post">
<label for="user_name" >User Name</label>
<input type="text" name="userName" id="userName" required="Required"/>
<label for="password">Password</label>
<input type="password" name="password" id="password" required="Required"/>
<input type="submit" value="Register"/>
</f:form>
</body>
</html>