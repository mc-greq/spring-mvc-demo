<!DOCTYPE html>
<html>

<head>
    <title>Hello world - input form</title>
</head>

<body>
    <form action="${pageContext.request.contextPath}/processFormVersionThree" method="get">
        <input type="text" name="studentName"
            placeholder="What's your name?">
        <input type="submit">
    </form>
</body>

</html>