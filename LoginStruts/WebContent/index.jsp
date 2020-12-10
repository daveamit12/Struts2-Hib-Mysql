<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags"  prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="login" method="post">

<label>userName</label>
<!-- <input type="text" name="username"> -->
<s:textfield type="text" name="username"></s:textfield>

<label>password</label>
<input type="text" name="password">

<button type="submit">login</button>

</form>

</body>
</html>