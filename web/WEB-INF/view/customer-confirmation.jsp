<%--
  Created by IntelliJ IDEA.
  User: Greg
  Date: 21.01.2019
  Time: 09:02
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer Confirmation</title>
</head>

<body>
The customer is confirmed: ${customer.firstName} ${customer.lastName}
<br><br>
Free passes: ${customer.freePasses}
<br><br>
Postal code: ${customer.postalCode}
<br><br>
Course code: ${customer.courseCode}
</body>

</html>
