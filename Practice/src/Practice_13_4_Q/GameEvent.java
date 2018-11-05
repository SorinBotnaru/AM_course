package Practice_13_4_Q;

import java.text.DecimalFormat;

public abstract class GameEvent {

    private Team teams;
    private Player players;
    private double time;

    public GameEvent(double time, Team team, Player player) {
        System.out.println("Goal scored after " + new DecimalFormat("##.##").format(time) + " mins by " + player + " of the " + team);
    }


    public void setTeams(Team teams) {
        this.teams = teams;
    }

    public void setPlayers(Player players) {
        this.players = players;
    }

    public void setTime(double time) {
        this.time = time;
    }


}
