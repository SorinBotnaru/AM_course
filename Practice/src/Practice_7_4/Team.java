package Practice_7_4;

public class Team {
    public String TeamName;
    public Player[] players = new Player[3];

    public Team(String teamName) {
        TeamName = teamName;
    }

    @Override
    public String toString() {
        return TeamName;
    }

    public void displayTeam() {
        System.out.println(TeamName + ":");
        for (Player pl : players
        ) {

            System.out.println(pl);


        }
    }

    //Display Format LastName, FirstName
    public void displayInformatLastFirst() {
        System.out.println("\nLast Name, First Name :");
        for (Player pl : players
        ) {
            System.out.println(pl.Name.substring((pl.Name.indexOf(" ")), pl.Name.length()) + "," + pl.Name.substring(0, pl.Name.indexOf(" ")));

        }

    }
}
