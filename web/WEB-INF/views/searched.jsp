<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="header.jsp"/>
<%--//searched--%>
<div class="container">
    <div class="row">
        <div align="center"><h4>Результаты поиска</h4></div>

    </div>
</div>
<table class="table-bordered" align="center">

    <c:forEach items="${searched}" var="BDriver">
        <tr>
            <td width="300px" color="#777">Номер</td>
            <td width="300px" color="#777">Описание</td>
        </tr>

        <tr>
            <td width="300px" bgcolor="#fff8dc"><c:out value="${BDriver.number}"/></td>
            <td width="300px" bgcolor="#fff8dc"><c:out value="${BDriver.description}"/></td>
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
                    <a href="#">1</a>
                </li>
                <li>
                    <a href="#">2</a>
                </li>
                <li>
                    <a href="#">3</a>
                </li>
                <li>
                    <a href="#">4</a>
                </li>
                <li>
                    <a href="#">5</a>
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

${searched.size()}
<jsp:include page="footer.jsp"/>