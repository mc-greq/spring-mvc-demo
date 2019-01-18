<%--
  Created by IntelliJ IDEA.
  User: Greg
  Date: 17.01.2019
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d" %>

<html>
<head>
    <title>Student Confirmation</title>
</head>

<body>

The student is confirmed: ${student.firstName} ${student.lastName}

<br><br>

Country: ${student.country}

<br><br>

Favourite language: ${student.favouriteLanguage}

<br><br>

Operating systems:

<ul>
    <d:forEach var="temp" items="${student.operatingSystems}">
        <li>${temp}</li>
    </d:forEach>

</ul>

</body>

</html>
