package com.example.myweb;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

import static com.example.myweb.HomeServlet.JSP_PATH;

@WebServlet("/news/science") // Сервлет для обработки запросов к научным новостям
public class ScienceMainNewsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Здесь можно получить данные новости из базы данных или другого источника
        String title = "Перелом в исследованиях космоса: Учёные обнаруживают признаки разумной жизни" +
                " на удалённой планете";
        String content = "В результате интенсивных наблюдений и анализа данных," +
                " предоставленных телескопами нового поколения," +
                " международная группа астрофизиков объявила о захватывающем открытии:" +
                " на планете, удалённой на 300 световых лет от Земли," +
                " обнаружены потрясающие признаки разумной жизни." +
                " Первые данные свидетельствуют о наличии комплексных" +
                " структур и регулярных сигналов, которые не могут быть объяснены" +
                " естественными явлениями. Этот научный прорыв открывает" +
                " новую эпоху в исследованиях космоса и возбуждает фантазию учёных" +
                " и общественности о возможности контакта" +
                " с интеллектуальными цивилизациями издалека."; // Содержание новости

        request.setAttribute("title", title); // Установка заголовка новости в запросе
        request.setAttribute("content", content); // Установка содержания новости в запросе

        // Перенаправление запроса на JSP-страницу с новостью
        request.getRequestDispatcher(JSP_PATH+"mainNews.jsp").forward(request, response);
    }
}
