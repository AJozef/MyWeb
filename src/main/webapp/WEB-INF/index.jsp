<!-- Главная страница с новостями разных категорий -->
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Главная страница</title>
    <style>
        .news-category {
            border: 1px solid #ccc;
            padding: 10px;
            margin: 10px;
            background-color: #f9f9f9;
        }

        .category-title {
            color: #333;
            font-size: 24px;
            margin-bottom: 10px;
            text-align: center;
        }

        .main-news {
            padding: 10px;
            background-color: #fff;
            border: 1px solid #ddd;
        }

        .main-news-title {
            font-size: 20px;
            color: #555;
        }

        .main-news-content {
            font-size: 18px;
            color: #777;
            border-bottom: 1px solid #ccc;
            padding-bottom: 2px;
            display: inline-block;
        }

        .other-news {
            padding: 10px;
            background-color: #f5f5f5;
        }

        .other-news-title {
            font-size: 18px;
            color: #444;
        }

        .other-news-list {
            list-style-type: none;
            padding-left: 0;
        }

        .other-news-list li {
            font-size: 18px;
            color: #666;
            text-decoration: underline;
            display: block;
            padding: 5px 0;
        }
    </style>
</head>
<body>
<jsp:include page="header.jsp"/> <!-- Включение общего заголовка сайта -->

<!-- Раздел новостей по категории "Общество" -->
<div class="news-category">
    <h2 class="category-title">Общество</h2>
    <a href="news/society"><div class="main-news">
        <h3 class="main-news-title">Мировой рекорд: Волонтёры посадили миллиард деревьев за один день, устанавливая пример для всего человечества</h3>
        <p class="main-news-content">В исторической массовой акции, организованной международными экологическими организациями, добровольцы...</p>
    </div></a>
    <div class="other-news">
        <h4 class="other-news-title">Другие новости:</h4>
        <ul class="other-news-list">
            <a href="#">
                <li>Новый музей открыт в центре города, представляющий культуру и историю местного народа</li>
            </a>
            <a href="#">
                <li>Местное сообщество собрало средства для постройки детской площадки в местном парке</li>
            </a>
            <a href="#">
                <li>Волонтеры собрали 10 тонн мусора во время массовой экологической акции "Чистый город"</li>
            </a>
        </ul>
    </div>
</div>

<!-- Раздел новостей по категории "Наука" -->
<div class="news-category">
    <h2 class="category-title">Наука</h2>
    <a href="news/science"><div class="main-news">
        <h3 class="main-news-title">Перелом в исследованиях космоса: Учёные обнаруживают признаки разумной жизни на удалённой планете</h3>
        <p class="main-news-content">В результате интенсивных наблюдений и анализа данных, предоставленных...</p>
    </div>
    </a>
    <div class="other-news">
        <h4 class="other-news-title">Другие новости:</h4>
        <ul class="other-news-list">
            <a href="#">
                <li>Ученые обнаружили новый вид редкой орхидеи в тропическом лесу</li>
            </a>
            <a href="#">
                <li>Международная космическая миссия успешно достигла удаленной планеты за 10 лет путешествия</li>
            </a>
            <a href="#">
                <li>Новые исследования подтверждают связь между счастьем и регулярной физической активностью</li>
            </a>
        </ul>
    </div>
</div>

<!-- Раздел новостей по категории "Политика" -->
<div class="news-category">
    <h2 class="category-title">Политика</h2>
    <a href="news/politics"><div class="main-news">
        <h3 class="main-news-title">Исторический перелом: Лидеры крупнейших стран объединились для создания Всемирного антикризисного фонда</h3>
        <p class="main-news-content">В ответ на множественные вызовы глобальных кризисов...</p>
    </div>
    </a>
    <div class="other-news">
        <h4 class="other-news-title">Другие новости:</h4>
        <ul class="other-news-list">
            <a href="#">
                <li>Правительство внедряет новую программу поддержки малого бизнеса с льготными кредитами</li>
            </a>
            <a href="#">
                <li>Парламент принимает решение о запрете одноразовых пластиковых изделий во всей стране</li>
            </a>
            <a href="#">
                <li>Президент подписал закон о повышении минимальной заработной платы для улучшения условий жизни рабочих</li>
            </a>
        </ul>
    </div>
</div>

<!-- Раздел новостей по категории "Экономика" -->
<div class="news-category">
    <h2 class="category-title">Экономика</h2>
    <a href="news/economics"><div class="main-news">
        <h3 class="main-news-title">Виртуальная революция:
            Криптовалюта становится официальным
            платежным средством ведущих стран</h3>
        <p class="main-news-content">На фоне стремительного развития технологий блокчейн,
            криптовалюты становятся...</p>
    </div>
    </a>
    <div class="other-news">
        <h4 class="other-news-title">Другие новости:</h4>
        <ul class="other-news-list">
            <a href="#">
                <li>Мировые биржи отмечают рекордный рост курсов акций ведущих технологических компаний</li>
            </a>
            <a href="#">
                <li>Крупный производитель электромобилей планирует строительство нового завода в Азии</li>
            </a>
            <a href="#">
                <li>Эксперты прогнозируют стабильный рост мировой экономики в следующем квартале</li>
            </a>
        </ul>
    </div>
</div>

</body>
</html>
