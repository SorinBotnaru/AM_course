package Practice_6_3;

public class League {
    public static void main(String[] args) {

        Player[] playersTeam1 = new Player[3];
        Player[] playersTeam2 = new Player[3];

        playersTeam1[0] = new Player("Cristiano Ronaldo");
        playersTeam1[1] = new Player("Lioneli Messi");
        playersTeam1[2] = new Player("Eden Azar");
        playersTeam2[0] = new Player("Serhio Aguero");
        playersTeam2[1] = new Player("Luca Modrici");
        playersTeam2[2] = new Player("David Bachman");


        Team team1 = new Team("Celsi", playersTeam1);
        Team team2 = new Team("Mancester United", playersTeam2);

        team1.displayTeam();
        System.out.println();
        team2.displayTeam();

        //start a game
        System.out.println("Goals:");
        Game game1 = new Game(2, team1, team2);


    }


}
