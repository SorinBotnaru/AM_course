package Practice_11_4;

import java.util.Random;

public class Game {

    private Team[] teams;

    public Game(Team[] teams) {
        this.teams = teams;
    }

    public Game() {

    }

    public void playGame(int numberOfGoals) {

        int countTeam1 = 0;
        int countTeam2 = 0;

        for (int i = 0; i < numberOfGoals; i++) {
            int randTeam = (int) (Math.random() * 2);

            if (randTeam == 0) {
                countTeam1++;
                teams[0].setTotalScore(1);

            } else {

                countTeam2++;
                teams[1].setTotalScore(1);

            }
            new Goal(Math.random() * 45.0, teams[randTeam], teams[randTeam].getPlayers()[(int) (Math.random() * 3)]);
        }
        if (countTeam1 > countTeam2) {
            System.out.println("The " + teams[0].getTeamName() + " win " + "(" + countTeam1 + "-" + countTeam2 + ")");

            teams[0].setTotalPointsTeam(2);
        }else if(countTeam1 == countTeam2) {
            System.out.println( "It's a draw !  " + "(" + countTeam2 + "-" + countTeam1 + ")");
            teams[0].setTotalPointsTeam(2);
            teams[1].setTotalPointsTeam(2);
        }
        else {
            System.out.println("The " + teams[1].getTeamName() + " win " + "(" + countTeam2 + "-" + countTeam1 + ")");

            teams[1].setTotalPointsTeam(2);

        }
    }

    public void playGame() {
        Random random = new Random();
        int countTeam1 = 0;
        int countTeam2 = 0;

        for (int i = 0; i < random.nextInt(6) + 1; i++) {
            int randTeam = (int) (Math.random() * 2);

            if (randTeam == 0) {
                countTeam1++;
                teams[0].setTotalScore(1);

            } else {

                countTeam2++;
                teams[1].setTotalScore(1);

            }
            new Goal(Math.random() * 45.0, teams[randTeam], teams[randTeam].getPlayers()[(int) (Math.random() * 3)]);
        }
        if (countTeam1 > countTeam2) {
            System.out.println("The " + teams[0].getTeamName() + " win " + "(" + countTeam1 + "-" + countTeam2 + ")");

            teams[0].setTotalPointsTeam(2);
        }else if(countTeam1 == countTeam2) {
            System.out.println( "It's a draw !  " + "(" + countTeam2 + "-" + countTeam1 + ")");
            teams[0].setTotalPointsTeam(2);
            teams[1].setTotalPointsTeam(2);
        }
        else {
            System.out.println("The " + teams[1].getTeamName() + " win " + "(" + countTeam2 + "-" + countTeam1 + ")");

            teams[1].setTotalPointsTeam(2);

        }


    }


}



