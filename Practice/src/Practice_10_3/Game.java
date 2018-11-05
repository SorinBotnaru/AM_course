package Practice_10_3;

public class Game {

    private Team[] teams ;

    public Game(Team[] teams) {
        this.teams = teams;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }

    public Team[] getTeams() {
        return teams;
    }

    public void playGame(int numberOfGoals) {
        for (int i = 0; i < numberOfGoals; i++) {
            int randTeam = (int) (Math.random() * 2);
            new Goal(Math.random() * 45.0, teams[randTeam], teams[randTeam].getPlayers()[(int) (Math.random() * 3)]);
        }
    }

    public void playGame() {
        int randNumboFGoals= (int) (Math.random()*6);
        for (int i = 0; i <randNumboFGoals; i++) {
            int randTeam = (int) (Math.random() * 2);
            new Goal(Math.random() * 45.0, teams[randTeam], teams[randTeam].getPlayers()[(int) (Math.random() * 3)]);
        }

    }


}



