package Practice_8_3;

public class League {

    public static Game createGame(Team[]teams){
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

        System.out.println("Goals:");
        return new Game( teams);
    }

    public static void main(String[] args) {

        Team []teams=new Team[2];

        createGame(teams).playGame();

    }


}
