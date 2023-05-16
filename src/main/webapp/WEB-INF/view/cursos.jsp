<%--
  Created by IntelliJ IDEA.
  User: Xavier Rordriguez
  Date: 08/05/2023
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Cursos</title>
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>Cursos a DAM</h1>
            <p>Llista de cursos den Xavier</p>
        </div>
    </div>
</section>
<section class="container">
    <div class="row">
        <c:forEach items="${cursos}" var="aCursos">
            <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                <div class="thumbnail">
                    <div class="caption">
                        <h3>${aCursos.cursId}</h3>
                        <p>${aCursos.titolCurs}</p>
                        <p>${aCursos.descCurs}</p>
                        <p>${aCursos.urlCurs}</p>
            <c:forEach items="${cursos}" var="XXXX">
                    <p>${XXXX.estudiants}</p>
            </c:forEach>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</section>
</body>
</html>
