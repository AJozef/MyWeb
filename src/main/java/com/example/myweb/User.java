package com.example.myweb;

public class User {
    private String password; // Пароль пользователя
    private String role;     // Роль пользователя (например, "Администратор", "Редактор")

    // Конструктор для создания нового объекта User с заданным паролем и ролью
    public User(String password, String role) {
        this.password = password;
        this.role = role;
    }

    // Геттер для получения пароля пользователя
    public String getPassword() {
        return password;
    }

    // Сеттер для установки нового пароля пользователя
    public void setPassword(String password) {
        this.password = password;
    }

    // Геттер для получения роли пользователя
    public String getRole() {
        return role;
    }

    // Сеттер для установки новой роли пользователя
    public void setRole(String role) {
        this.role = role;
    }
}