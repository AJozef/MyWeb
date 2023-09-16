package com.example.myweb;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

import static com.example.myweb.HomeServlet.JSP_PATH;

@WebServlet("/news/society") // Сервлет для обработки запросов к общественным новостям
public class SocietyMainNewsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Здесь можно получить данные новости из базы данных или другого источника
        String title = "Мировой рекорд: Волонтёры посадили миллиард деревьев" +
                " за один день, устанавливая пример для всего человечества";
        String content = "В исторической массовой акции, организованной" +
                " международными экологическими организациями, добровольцы" +
                " со всего мира собрались, чтобы посадить миллиард деревьев" +
                " в различных уголках планеты. Широкомасштабное мероприятие" +
                " призвано бороться с изменением климата и остановить" +
                " уничтожение лесов. Задача, которая казалась невозможной," +
                " была успешно выполнена благодаря мощному глобальному движению" +
                " за сохранение природы. Этот акт единства и солидарности" +
                " вызвал восхищение и воодушевление у миллионов людей" +
                " по всему миру, ставя яркий пример" +
                " ответственного отношения к окружающей среде."; // Содержание новости

        request.setAttribute("title", title); // Установка заголовка новости в запросе
        request.setAttribute("content", content); // Установка содержания новости в запросе

        // Перенаправление запроса на JSP-страницу с новостью
        request.getRequestDispatcher(JSP_PATH+"mainNews.jsp").forward(request, response);
    }
}
