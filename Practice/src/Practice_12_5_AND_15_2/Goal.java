package Practice_12_5_AND_15_2;

import java.text.DecimalFormat;

public class Goal {

    private double time = 0.0;
    private Team team;
    private Player player;

    public void setTime(double time) {
        this.time = time;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public double getTime() {
        return time;
    }

    public Team getTeam() {
        return team;
    }

    public Player getPlayer() {
        return player;
    }

    public Goal(double time, Team team, Player player) {

        this.time = time;
        this.team = team;
        this.player = player;

        System.out.println("Goal scored after " + new DecimalFormat("##.##").format(time) + " mins by " + player + " of the " + team);


    }


}


