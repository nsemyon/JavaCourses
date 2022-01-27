package ru.java.courses.sports.teams.football;

import ru.java.courses.sports.Athlete;
import ru.java.courses.sports.ScoringPlayer;

public class FootballPlayer extends Athlete implements ScoringPlayer {
    private String name;
    private int goals = 0;
    private PlayerRole role;
    private boolean active = true;

    public FootballPlayer(String name, PlayerRole role) {
        super(name);
        if (role != null){
            this.role = role;
        } else {
            throw new IllegalArgumentException("Игрок обязан иметь роль!");
        }
    }
    public void score(){
        if(this.active){
            this.goals +=1;
        }
        else {
            throw new IllegalArgumentException("Забивают только активные игроки");
        }
    }

    public int getGoals() {
        return goals;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public PlayerRole getRole() {
        return role;
    }
    public void setRole(PlayerRole role) {
        if (role != null){
            this.role = role;
        } else {
            throw new IllegalArgumentException("Игрок обязан иметь роль!");
        }
    }
}
