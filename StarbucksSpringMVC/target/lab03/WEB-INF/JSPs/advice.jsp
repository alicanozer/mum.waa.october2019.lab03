<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/30/2019
  Time: 4:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Advice</title>
</head>
<body>
<h2>Ask for advice about your favorite roast:</h2>
<p />
<form action="advice" method="get">
    <select name="roast">
        <option value="-">--Choose Roast--</option>
        <option value="dark">Dark</option>
        <option value="medium">Medium</option>
        <option value="light">Light</option>
    </select>
    <input type="submit" value = "Submit"/>
</form>

</body>
</html>
