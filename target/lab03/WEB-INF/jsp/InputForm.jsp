<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Calculator</title>
    <link rel="stylesheet" type="text/css" href="../css/main.css">
</head>
<body>

<div id="global">
    <c:if test="${operation.errors != null}">

        <p id="errors">
            Error(s)!
        <ul>
            <c:forEach var="error" items="${operation.errors}">
                <li>${error}</li>
            </c:forEach>
        </ul>

    </c:if>

    <form action="calculator" method="post">
        <fieldset>
            <legend>Simple Calculator</legend>
            <p>
                <input type="number" name="sum1"/>+
                <input type="number" name="sum2" size="4"/>
            </p>
            <p>
                <input type="number" name="mult1" size="4"/>*
                <input type="number" name="mult2" size="4"/>
            </p>

            <p id="buttons">
                <input id="reset" type="reset">
                <input id="submit" type="submit" value="Calculate">
            </p>
        </fieldset>
    </form>
</div>
</body>
</html>
