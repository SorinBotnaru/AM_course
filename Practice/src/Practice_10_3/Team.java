package Practice_10_3;

public class Team {
    private String teamName;
    private Player[] players;

    public Team(String teamName, Player[] players) {
        this.teamName = teamName;
        this.players=players;
    }


    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public String getTeamName() {
        return teamName;
    }

    public Player[] getPlayers() {
        return players;
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
