<!-- Страница входа -->
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Вход</title>
    <style>
        .login-form {
            display: block;
            text-align: center; /* Центрируем содержимое по горизонтали */
        }

        .login-form input, /* Применяем стиль ко всем input внутри .login-form */
        .login-form a {
            display: block;
            margin: 10px; /* Добавляем отступы сверху и снизу, автоматически центрируя элементы по горизонтали */
            width: 200px; /* Задаем ширину для элементов */
        }

        .error-message {
            color: red;
        }
    </style>
</head>
<body>
    <jsp:include page="header.jsp"/> <!-- Включение общего заголовка сайта -->
    <% if (request.getAttribute("errorMessage") != null) { %>
        <div class="error-message">
            <%= request.getAttribute("errorMessage") %> <!-- Отображение сообщения об ошибке, если оно существует -->
        </div>
    <% } %>
    <form class="login-form" action="login" method="post"> <!-- Форма входа -->
        <input type="text" name="username" placeholder="Логин" required> <!-- Поле для ввода имени пользователя -->
        <input type="password" name="password" placeholder="Пароль" required> <!-- Поле для ввода пароля -->
        <input type="hidden" name="referer" value="<%= request.getHeader("Referer") %>"> <!-- Скрытое поле для сохранения исходного URL -->
        <input type="submit" value="Войти"> <!-- Кнопка для отправки формы -->
        <input type="button" value="Регистрация"> <!-- Кнопка для перехода к регистрации (если необходимо) -->
    </form>
</body>
</html>