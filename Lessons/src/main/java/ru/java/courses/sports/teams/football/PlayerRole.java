package ru.java.courses.sports.teams.football;

public enum PlayerRole {
    GOALKEEPER("Вратарь"),
    DEFENDER("Защитник"),
    WINGER("Нападающий");
    private String name;
    PlayerRole(String name) {
        this.name = name;
    }
}
