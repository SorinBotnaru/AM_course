package Practice_6_3;

public class Game {
    private int numberOfGames;
    private Team homeTeam;
    private Team awayTeam;

    public Game(int numberOfGames, Team homeTeam, Team awayTeam) {

        this.numberOfGames = numberOfGames;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        Goal goal1 = new Goal(Math.random()*45.0, homeTeam, homeTeam.players[(int) (Math.random() * 3)]);
        Goal goal2 = new Goal(Math.random()*45.0, awayTeam, awayTeam.players[(int) (Math.random() * 3)]);
    }


}
