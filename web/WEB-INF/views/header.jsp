<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Documents</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <link href='https://fonts.googleapis.com/css?family=Coming+Soon' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="/css/style.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<header>
    <nav class="navbar navbar-default ">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                        data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">AutoPozor</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav menu">
                    <li>
                        <a href="${pageContext.request.contextPath}/">
                            главная
                            <span class="sr-only">(current)</span>
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/#">обочечники</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/#">без поворотников</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/#">парковщики</a>
                    </li>
                </ul>
                <form:form class="navbar-form navbar-left" role="search" modelAttribute="search" action="${pageContext.request.contextPath}/search" method="post">
                    <div class="form-group">
                        <form:input type="text" class="form-control" placeholder="xYYYxxZZZ" path="number"/>
                       </div>
                    <button type="submit" class="btn btn-default">Поиск</button>
                </form:form>
                <ul class="nav navbar-nav navbar-right">
                    <li class="right">
                        <a href="/confidential/addDriver">добавить нарушителя</a>
                    </li>
                    <li class="right">
                        <a href="${pageContext.request.contextPath}/registration">зарегистрироваться</a>
                    </li>
                    <li class="dropdown right">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                           aria-expanded="false">
                            акаунт
                            <span class="caret"></span>
                        </a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="${pageContext.request.contextPath}/login">войти</a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/logout">выйти</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse --> </div>
        <!-- /.container-fluid --> </nav>
</header>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
</body>
</html>