package com.example.myweb;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
    public static final String JSP_PATH = "/WEB-INF/"; // Константа для пути к JSP-файлам

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(); // Получение сессии
        User user = (User) session.getAttribute("user"); // Получение объекта пользователя из сессии

        if (user != null) {
            request.setAttribute("password", user.getPassword()); // Установка пароля в атрибуты запроса
            request.setAttribute("role", user.getRole()); // Установка роли в атрибуты запроса
        }
        // Получение диспетчера запросов для перенаправления
        RequestDispatcher dispatcher = request.getRequestDispatcher(JSP_PATH+"index.jsp");
        dispatcher.forward(request, response); // Перенаправление на страницу index.jsp
    }
}
