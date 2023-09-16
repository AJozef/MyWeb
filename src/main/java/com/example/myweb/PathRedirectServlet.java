package com.example.myweb;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/") // Аннотация, указывающая, что этот сервлет будет обрабатывать запросы к корневому пути
public class PathRedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("/home"); // Перенаправление всех GET-запросов к корневому пути на /home
    }
}