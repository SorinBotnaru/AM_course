package Practice_7_4;

public class Goal {
    public double Time;
    public Team team;

    public Player player;

    public Goal(double time, Team team, Player player) {

        Time = time;
        this.team = team;
        this.player=player;

        System.out.println("Goal scored after "+time+" mins by "+player+" of the "+team);


    }
}


