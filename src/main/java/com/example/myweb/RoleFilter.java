package com.example.myweb;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebFilter("/*") // Аннотация, указывающая, что этот фильтр будет применяться ко всем запросам
public class RoleFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        HttpSession session = httpRequest.getSession();

        String requestURI = httpRequest.getRequestURI(); // Получение URI запрашиваемого ресурса
        User user = (User) session.getAttribute("user"); // Получение объекта пользователя из сессии

        if (user != null) {
            httpRequest.setAttribute("role", user.getRole()); // Установка атрибута роли в запросе
            // Если пользователь авторизован и пытается получить доступ к /login,
            // перенаправляем его на главную страницу
            if (requestURI.endsWith("/login")) {
                httpResponse.sendRedirect(httpRequest.getContextPath() + "/home");
                return;
            }
        }
        else {
            // Если пользователь не авторизован и пытается получить доступ к /logout,
            // перенаправляем его на страницу входа
            if (requestURI.endsWith("/logout")) {
                httpResponse.sendRedirect(httpRequest.getContextPath() + "/home");
                return;
            }
        }

        chain.doFilter(request, response); // Продолжение обработки запроса другими фильтрами и сервлетами
    }
}