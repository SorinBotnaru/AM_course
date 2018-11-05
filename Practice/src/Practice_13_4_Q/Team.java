package Practice_13_4_Q;

public class Team {
    private String teamName;
    private Player[] players;
    private  int totalPointsTeam =0;
    private  int totalScore=0;


    public void setTotalScore(int totalScore) {
        this.totalScore += totalScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalPointsTeam(int totalPointsTeam) {
        this.totalPointsTeam +=totalPointsTeam;
    }

    public int getTotalPointsTeam() {
        return totalPointsTeam;
    }

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
