<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Users</title>
</head>
<body>
	<c:if test="${empty userList}">
                There are no Users
            </c:if>
	<c:if test="${not empty userList}">
		<table border="1">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${userList}" var="user">
					<tr>
						<th><c:out value="${user.id}" /></th>
						<th><c:out value="${user.userName}" /></th>
						</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:if>

</body>
</html>