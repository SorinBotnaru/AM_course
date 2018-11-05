package Practice_6_3;

public class Goal {
    private double time =0.0;
    private Team team;

    public Player player;

    public Goal(double time, Team team,Player player) {

        this.time = time;
        this.team = team;
        this.player=player;

        System.out.println("Goal scored after "+time+" mins by "+player+" of the "+team);


    }
}


