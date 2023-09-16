<!-- Отображение основной новости -->
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <!-- Установка заголовка из атрибута запроса -->
    <title><%= request.getAttribute("title") %></title>
    <style>
        .container {
            max-width: 800px; /* Ограничение ширины контента */
            margin: 20px auto; /* Выравнивание по центру */
            padding: 20px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        p {
            line-height: 1.8;
            color: #666;
            font-size: 18px;
            text-align: justify;
        }
    </style>
</head>
<body>
    <jsp:include page="header.jsp"/> <!-- Включение заголовка сайта -->
    <div class="container">
        <!-- Отображение заголовка и содержания новости -->
        <h1><%= request.getAttribute("title") %></h1>
        <p><%= request.getAttribute("content") %></p>
    </div>
</body>
</html>