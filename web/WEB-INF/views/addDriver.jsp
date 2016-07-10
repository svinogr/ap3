<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="header.jsp"/>

<div class="container" align="center">
    <h5 class="text-center">Добавление нарушителя</h5>
<div class="col-lg-12" align="center">
<form:form modelAttribute="driver" action="${pageContext.request.contextPath}/confidential/addNewDriver" method="post"
           acceptCharset="UTF-8">
    <table class="table-bordered">
        <tr>
            <td><form:label path="number">Номер:</form:label></td>
            <td><form:input path="number" /></td>

        </tr>
        <tr>
            <td><form:label  path="description">Описание:</form:label></td>
            <td ><form:textarea  path="description"/></td>

        </tr>
        <tr>
            <td><input type="submit" value="Отправить"></td>
        </tr>

    </table>
</form:form>
    </div>
</div>

<jsp:include page="footer.jsp"/>