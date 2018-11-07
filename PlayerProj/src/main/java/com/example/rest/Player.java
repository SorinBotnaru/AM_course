package com.example.rest;

public class Player {
    private final long id;
    private final String team;
    private final String name;
    private final String position;
    private final String number;
    private final String country;
    private final long goals;
    private final long yellowCards;


    public Player() {
        id = 0;
        team=null;
        name=null;
        position=null;
        number=null;
        country=null;
        goals=0;
        yellowCards=0;
    }

    public Player(long id, String team, String name, String position, String number, String country, long goals, long yellowCards) {
        this.id = id;
        this.team = team;
        this.name = name;
        this.position = position;
        this.number = number;
        this.country = country;
        this.goals = goals;
        this.yellowCards = yellowCards;
    }

    public long getId() {
        return id;
    }

    public String getTeam() {
        return team;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getNumber() {
        return number;
    }

    public String getCountry() {
        return country;
    }

    public long getGoals() {
        return goals;
    }

    public long getYellowCards() {
        return yellowCards;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", team='" + team + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", number='" + number + '\'' +
                ", country='" + country + '\'' +
                ", goals=" + goals +
                ", yellowCards=" + yellowCards +
                '}';
    }
}
