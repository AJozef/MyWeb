<!-- Заголовок сайта с кнопками навигации и информацией о пользователе -->
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.example.myweb.User" %>

<style>
    body {
        font-family: Arial, sans-serif;
        margin: 20px;
        background-color: #f9f9f9;
    }
    a {
        text-decoration: none;
        color: #333;
    }
    h1 {
        display: inline;
        margin-left: 20px;
        font-size: 28px;
        padding-bottom: 10px;
    }
    header {
        background-color: #f1f1f1;
        padding: 10px;
        box-shadow: 0 0 10px rgba(0,0,0,0.1);
        position: relative;
    }
    .button-link {
        padding: 5px 10px;
        background-color: #fff; /* Цвет фона ссылки */
        border-radius: 3px;
    }
    .role-settings {
        position: absolute; /* Абсолютное позиционирование */
        top: 10px; /* Отступ сверху */
        right: 10px; /* Отступ справа */
        display: flex;
        gap: 10px;
    }
    .role-buttons {
        display: flex;
        gap: 10px;
        padding: 10px;
        background-color: #f3f3f3;
        margin-top: 10px; /* Отступ сверху */
    }
    body {
        font-family: Arial, sans-serif;
        margin: 20px;
        background-color: #f9f9f9;
    }
</style>
<header>
    <% User user = (User) session.getAttribute("user"); %> <!-- Получение данных пользователя из сессии -->
    <% String role = (String) request.getAttribute("role"); %> <!-- Получение роли пользователя из запроса -->
    <a href="${pageContext.request.contextPath}/home">
        <h1>Новостной сайт "Горизонт"</h1> <!-- Заголовок сайта -->
    </a>
    <!-- Кнопки, доступные в зависимости от роли пользователя -->
    <div class="role-buttons">
        <!-- Кнопка для всех, начиная с участника -->
        <% if (role != null) { %>
        <a href="#" class="button-link">Создать пост</a>
        <% } %>

        <!-- Кнопка для редактора и выше -->
        <% if ("Редактор".equals(role) || "Администратор".equals(role)) { %>
        <a href="#" class="button-link">Модерация</a>
        <% } %>

        <!-- Кнопка только для администратора -->
        <% if ("Администратор".equals(role)) { %>
        <a href="#" class="button-link">Управление сайтом</a>
        <% } %>
    </div>

    <div class="role-settings">
        <% if (user != null) { %>
        <a href="#" class="button-link">Профиль (${user.getRole()})</a> <!-- Ссылка на профиль пользователя -->
        <a href="${pageContext.request.contextPath}/logout" class="button-link">Выход</a> <!-- Ссылка для выхода из системы -->
        <% } else { %>
        <a href="${pageContext.request.contextPath}/login" class="button-link">Вход/Регистрация</a> <!-- Ссылка для входа или регистрации -->
        <% } %>
    </div>
</header>