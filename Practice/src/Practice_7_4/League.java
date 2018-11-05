package Practice_7_4;

public class League {

//Search methods
    public static void search(Player[] players, String string) {
        System.out.println();
        for (Player pl : players
        ) {
            if (pl.Name.contains(string)) {
                System.out.println("Found " + pl.Name);
            }

        }
    }

//Search method using RegExp
    public static void searchUsingRegEx(Player[] players, String string) {
        System.out.println();
        for (Player pl : players
        ) {
            if (pl.Name.matches(".*" + string + ".*")) {
                System.out.println("Found: " + pl.Name);
            }

        }
    }


    public static void main(String[] args) {
        Player[] players = new Player[6];
        players[0] = new Player("Cristiano Ronaldo");
        players[1] = new Player("Lioneli Messi");
        players[2] = new Player("Eden Azar");
        players[3] = new Player("Serhio Aguero");
        players[4] = new Player("Luca Modrici");
        players[5] = new Player("David Bachman");


        Team team1 = new Team("Celsi");
        Team team2 = new Team("Mancester United");


        //celsi players
        team1.players[0] = players[0];
        team1.players[1] = players[1];
        team1.players[2] = players[2];

        //manchester players
        team2.players[0] = players[3];
        team2.players[1] = players[4];
        team2.players[2] = players[5];

        team1.displayTeam();
        System.out.println();
        team2.displayTeam();

        //start a game
        Game game1 = new Game(2, team1, team2);
        System.out.println("\nGoals:");
        Goal goal1 = new Goal(12.0, team1, team1.players[0]);
        Goal goal2 = new Goal(17.0, team2, team2.players[0]);
        Goal goal3 = new Goal(25.0, team2, team2.players[2]);


        searchUsingRegEx(players, "Cris");


        team1.displayInformatLastFirst();


    }


}
