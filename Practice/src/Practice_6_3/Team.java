package Practice_6_3;

public class Team {
    public String teamName;
    public Player[] players;

    public Team(String teamName,Player[] players) {
        this.teamName = teamName;
        this.players=players;
    }

    @Override
    public String toString() {
        return teamName;
    }

    public void displayTeam(){
        System.out.println(teamName +":");
        for (Player pl:players
             ) {

                System.out.println(pl);



        }

    }

}
