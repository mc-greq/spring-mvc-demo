<%--
  Created by IntelliJ IDEA.
  User: Greg
  Date: 17.01.2019
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<head>
    <title>Student Registration Form</title>
</head>

<body>

    <form:form action="processForm" modelAttribute="student">

        First name: <form:input path="firstName"/>

        <br><br>

        Last name: <form:input path="lastName"/>

        <br><br>

        Country:

        <form:select path="country">
            <form:options items="${theCountryOptions}"/>
        </form:select>

        <br><br>

        <!-- Radio buttons with set values
        Favourite Language:
        <br>
        Java: <form:radiobutton path="favouriteLanguage" value="Java"/>
        C#: <form:radiobutton path="favouriteLanguage" value="C#"/>
        PHP: <form:radiobutton path="favouriteLanguage" value="PHP"/>
        Ruby: <form:radiobutton path="favouriteLanguage" value="Ruby"/>

        <br><br>
        -->

        <!-- Radio buttons with data from the Student class -->
        Favourite Language:
        <br>
        <form:radiobuttons path="favouriteLanguage" items="${student.favouriteLanguageMap}"/>
        <br><br>

        Operating Systems:
        <br>
        Linux <form:checkbox path="operatingSystems" value="Linux"/>
        Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
        Windows <form:checkbox path="operatingSystems" value="Windows"/>

        <br><br>

        <input type="submit" value="Submit"/>

    </form:form>

</body>

</html>
