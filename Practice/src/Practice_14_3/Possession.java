package Practice_14_3;

import java.text.DecimalFormat;

public class Possession extends GameEvent {

    public Possession(double time, Team team, Player player) {
        super(time, team, player);
        System.out.println("Possession after " + new DecimalFormat("##.##").format(time) + " mins by " + player + " of the " + team);

    }
}
