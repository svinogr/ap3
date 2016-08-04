<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="header.jsp"/>
<div class="container">
    <div class="row">
        <div align="center">
            <a href="${pageContext.request.contextPath}/testUpload" align="center">Тест Загрузка Файла</a>
        </div>
        <div align="center">
            <h4 align="center">Последние добавленые:</h4>
        </div>
    </div>
</div>


<table class="table-bordered" align="center"  acceptCharset="UTF-8">

    <c:forEach items="${driver}" var="BDriver">
        <tr>
            <td width="300px" color="#777">Номер</td>
            <td width="300px" color="#777">Описание</td>
            <td width="300px" color="#777">Тип</td>
            <td width="500px" color="#777">Фото</td>

        </tr>

        <tr>
            <td width="300px" bgcolor="#fff8dc"><c:out value="${BDriver.number}"/></td>
            <td width="300px" bgcolor="#fff8dc"><c:out value="${BDriver.description}"/></td>
            <td width="300px" bgcolor="#fff8dc"><c:out value="${BDriver.type}"/></td>
            <td width="300px" bgcolor="#fff8dc"><img src="<c:out value="${BDriver.idImage.link}"/>"></td>
        </tr>
        <tr>
            &nbsp
        </tr>


    </c:forEach>
</table>
<div  class="content">
    <div class="container">
        <nav class="nav-pagination">
            <ul class="pagination">
                <li>
                    <a href="#" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/new?page=0">1</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/new?page=20">2</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/new?page=40">3</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/new?page=50">4</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/new?page=60">5</a>
                </li>
                <li>
                    <a href="#" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>
            </ul>
        </nav>
    </div>
</div>


<jsp:include page="footer.jsp"/>