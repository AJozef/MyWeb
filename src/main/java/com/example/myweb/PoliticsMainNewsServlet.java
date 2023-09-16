package com.example.myweb;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

import static com.example.myweb.HomeServlet.JSP_PATH;

@WebServlet("/news/politics") // Сервлет для обработки запросов к политическим новостям
public class PoliticsMainNewsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Здесь можно получить данные новости из базы данных или другого источника
        String title = "Исторический перелом: Лидеры крупнейших стран объединились для создания Всемирного антикризисного фонда";
        String content = "В ответ на множественные вызовы глобальных кризисов, " +
                "таких как пандемии, природные бедствия и экономические колебания," +
                " лидеры крупнейших стран объединили свои усилия, чтобы сформировать" +
                " Всемирный антикризисный фонд (ВАФ). Этот исторический шаг" +
                " направлен на координацию и обеспечение совместных решений" +
                " для предотвращения катастрофических последствий глобальных кризисов." +
                " Фонд будет содействовать разработке общих стратегий," +
                " финансированию масштабных международных проектов" +
                " и созданию механизмов для эффективной реакции на вызовы современности."; // Содержание новости

        request.setAttribute("title", title); // Установка заголовка новости в запросе
        request.setAttribute("content", content); // Установка содержания новости в запросе

        request.getRequestDispatcher(JSP_PATH+"mainNews.jsp").forward(request, response); // Перенаправление запроса на JSP-страницу с новостью
    }
}
