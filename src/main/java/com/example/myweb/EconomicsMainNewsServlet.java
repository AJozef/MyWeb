package com.example.myweb;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

import static com.example.myweb.HomeServlet.JSP_PATH;

@WebServlet("/news/economics") // Сервлет для обработки запросов к экономическим новостям
public class EconomicsMainNewsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Здесь можно получить данные новости из базы данных или другого источника
        String title = "Виртуальная революция: Криптовалюта становится официальным платежным средством ведущих стран";
        String content = "На фоне стремительного развития технологий блокчейн, " +
                "криптовалюты становятся неотъемлемой частью мировой экономики. " +
                "Ведущие страны объявили официальное признание криптовалюты" +
                " в качестве законного платежного средства, предоставляя новую альтернативу" +
                " традиционным финансовым системам. Этот шаг усиливает доверие к криптовалютам," +
                " повышает стабильность и привлекательность цифровых активов," +
                " а также способствует развитию инноваций в области финансовых технологий." +
                " Однако вместе с перспективами возникают и новые риски," +
                " и мировое сообщество активно обсуждает надлежащие" +
                " правовые и регуляторные механизмы для управления этим новым экономическим ландшафтом."; // Содержание новости

        request.setAttribute("title", title); // Установка заголовка новости в запросе
        request.setAttribute("content", content); // Установка содержания новости в запросе

        request.getRequestDispatcher(JSP_PATH+"mainNews.jsp").forward(request, response); // Перенаправление запроса на JSP-страницу с новостью
    }
}