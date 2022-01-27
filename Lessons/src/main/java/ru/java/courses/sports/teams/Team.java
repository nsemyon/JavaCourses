package ru.java.courses.sports.teams;

import ru.java.courses.sports.Athlete;
import ru.java.courses.sports.ScoringPlayer;
import ru.java.courses.sports.Coach;

import java.util.ArrayList;
import java.util.List;

public abstract class Team<T extends Athlete & ScoringPlayer> {
    private Coach coach;
    private List<T> players = new ArrayList<>();
    private String name;

    public Team(String name){
        if (name != null && !name.equals("")){
            this.name = name;
        } else {
            throw new IllegalArgumentException("Имя не может быть пустым3");
        }
    }
}
