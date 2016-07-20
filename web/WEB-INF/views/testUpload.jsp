<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Upload</title>
</head>
<body>
<form:form modelAttribute="driver" enctype="multipart/form-data" action="${pageContext.request.contextPath}/addNewDriverTest" method="post"
           acceptCharset="UTF-8">
    <table class="table-bordered">
       <tr>
            <td><input type="file" name="file"></td>


        </tr>
        <tr>
            <td><input type="submit" value="Отправить"></td>
        </tr>

    </table>
</form:form>


</body>
</html>
