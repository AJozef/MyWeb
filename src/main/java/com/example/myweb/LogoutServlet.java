package com.example.myweb;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().invalidate(); // Удаление сессии
        String referer = request.getParameter("referer"); // Получение referer из параметров запроса
        if (referer != null && !referer.isEmpty()) {
            response.sendRedirect(referer); // Перенаправление на сохраненный URL
        } else {
            response.sendRedirect("/home"); // Или на главную страницу, если URL не сохранен
        }
    }
}