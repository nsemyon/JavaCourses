package ru.java.courses.sports.teams.football;

import java.util.ArrayList;
import java.util.Arrays;
import ru.java.courses.sports.Coach;
import ru.java.courses.sports.teams.Team;

public class FootballTeam extends Team<FootballPlayer>{
    private String name;
    private final static int maxPlayers = 20;
    private ArrayList<FootballPlayer> players = new ArrayList<>();
    private Coach coach;

    public FootballTeam(String name) {
        super(name);
    }

    public void addPlayer(FootballPlayer footballPlayer){
        if(this.players.size() < maxPlayers){
            players.add(footballPlayer);
        } else {
            throw new IllegalArgumentException("В команде нет мест");
        }
    }

    public void addPlayers(FootballPlayer ...groupPlayers){
        if (groupPlayers.length + players.size() < maxPlayers) {
            players.addAll(Arrays.asList(groupPlayers));
        } else {
            throw new IllegalArgumentException("В команде не достаточно свободных мест.");
        }
    }

    public void removePlayer(FootballPlayer footballPlayer){
        players.remove(footballPlayer);
    }

    public int getPlayersCount(){
        return players.size();
    }
    public int getMaxPlayersCount(){
        return maxPlayers;
    }

    public String getName() {
        return name;
    }

    public ArrayList<FootballPlayer> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<FootballPlayer> players) {
        this.players = players;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Coach getCoach() {
        return coach;
    }

    public int getScore(){
        int goals = 0;
        //for(int i=0;i<players.size();i++){
        for(FootballPlayer player : players){
            //goals +=players.get(i).getGoals();
            goals +=player.getGoals();
        }
        return goals;
    }

    public void setName(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Имя не может быть пустым!");
        }
    }
}
