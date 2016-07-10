<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="header.jsp"/>


<div class="container">
    <h5 class="text-center">Регистрация нового пользователя</h5>
</div>

<span class="alert">${result}</span> <br />

<form:form modelAttribute="user" action="${pageContext.request.contextPath}/registrationNewUser" method="post" acceptCharset="UTF-8">
    <table class="table-bordered" align="center">
        <tr>
            <td><form:label path="name">Имя:</form:label></td>
            <td><form:input path="name"/></td>
            <c:if test="${error eq 'error'}" >
                <td class="alert"><form:errors path="name"/></td>
            </c:if>
        </tr>
        <tr>
            <td><form:label path="login">Login:</form:label></td>
            <td><form:input path="login"/></td>
            <c:if test="${error eq 'error'}" >
                <td class="alert"><form:errors path="login"/></td>
            </c:if>
        </tr>
        <tr>
            <td><form:label path="password">Пароль:</form:label></td>
            <td><form:input path="password"/></td>
            <c:if test="${error eq 'error'}" >
                <td class="alert"><form:errors path="password"/></td>
            </c:if>
        </tr>
        <tr>
            <td><form:label path="email">E-mail:</form:label></td>
            <td><form:password path="email"/></td>
            <c:if test="${error eq 'error'}" >
                <td class="alert"><form:errors path="email"/></td>
            </c:if>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="Зарегистрироваться!"/>
            </td>
        </tr>
    </table>
</form:form>
<jsp:include page="footer.jsp"/>