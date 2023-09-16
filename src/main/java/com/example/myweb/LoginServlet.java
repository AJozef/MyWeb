package com.example.myweb;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.example.myweb.HomeServlet.JSP_PATH;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String referer = request.getHeader("Referer"); // Получение заголовка referer
        if (referer != null && !referer.endsWith("/login")) { // Проверка, чтобы это не была страница входа
            request.getSession().setAttribute("originalReferer", referer); // Сохранение referer в сессии
        }
        // Перенаправление на страницу login.jsp
        request.getRequestDispatcher(JSP_PATH+"login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Получение параметров из запроса
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Создание карты пользователей
        Map<String, User> users = new HashMap<>();
        users.put("admin", new User("admin123","Администратор"));
        users.put("editor", new User("editor123", "Редактор"));
        users.put("member", new User("member123", "Участник"));

        // Логика проверки имени пользователя и пароля
        if (users.containsKey(username)) {
            User user = users.get(username);
            // Успешный вход
            if (user.getPassword().equals(password)) {
                request.getSession().setAttribute("user", user); // Сохранение пользователя в сессии
                // Получение сохраненного referer из сессии
                String originalReferer = (String) request.getSession().getAttribute("originalReferer");
                if (originalReferer != null) {
                    response.sendRedirect(originalReferer); // Перенаправление на сохраненный URL
                    request.getSession().removeAttribute("originalReferer"); // Удаление атрибута из сессии
                } else {
                    response.sendRedirect("/home"); // Или на главную страницу, если URL не сохранен
                }
            }
            else {
                // Неправильный пароль
                request.setAttribute("errorMessage", "Неправильный пароль");
                RequestDispatcher dispatcher = request.getRequestDispatcher(JSP_PATH+"login.jsp");
                dispatcher.forward(request, response);
            }
        }
        else {
            // Пользователь не найден
            request.setAttribute("errorMessage", "Пользователя с таким логином не существует");
            RequestDispatcher dispatcher = request.getRequestDispatcher(JSP_PATH+"login.jsp");
            dispatcher.forward(request, response);
        }
    }
}