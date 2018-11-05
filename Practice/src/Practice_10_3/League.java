package Practice_10_3;

public class League {

    public Game[] createGame(Team[] teams, int numberOfGames) {
        Player[] playersTeam1 = new Player[3];
        Player[] playersTeam2 = new Player[3];

        playersTeam1[0] = new Player("Cristiano Ronaldo");
        playersTeam1[1] = new Player("Lioneli Messi");
        playersTeam1[2] = new Player("Eden Azar");
        playersTeam2[0] = new Player("Serhio Aguero");
        playersTeam2[1] = new Player("Luca Modrici");
        playersTeam2[2] = new Player("David Bachman");

        teams[0] = new Team("Celsi", playersTeam1);
        teams[1] = new Team("Mancester United", playersTeam2);

        Game[] games = new Game[numberOfGames];

        for (int i = 0; i < numberOfGames; i++) {
            games[i] = new Game(teams);
        }

        return games;
    }

    public void generateGames(int numberOfGames){
        League league = new League();
        Team[] teams = new Team[2];

        for (Game games : league.createGame(teams, numberOfGames)
        ) {
            games.playGame();
            System.out.println();

        }

    }


    public static void main(String[] args) {

        League league = new League();

        league.generateGames(3);


    }
}