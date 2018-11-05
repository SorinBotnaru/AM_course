package Practice_12_5_AND_15_2;

import utility.PlayerDatabase;
import utility.PlayerDatabaseException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;


public class League {
    public static void main(String[] args) {

        League league = new League();

        league.generateGames(3, 8, 3);

    }

    public static void displayDurationOfLeague() {
        int durationOfLeague = (Game.getNumberOfGames()-1) * 7;

        //work with date
        LocalDate oldDate = LocalDate.of(2018, Month.NOVEMBER, 1);
        LocalDate newDate = LocalDate.of(2018, Month.NOVEMBER, 1);
        // LocalDate newDateTodis = LocalDate.of(2018, Month.NOVEMBER, 1);
        Calendar cTo = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Calendar c = Calendar.getInstance();
        try {
            cTo.setTime(sdf.parse(String.valueOf(newDate)));
            c.setTime(sdf.parse(String.valueOf(oldDate)));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        cTo.add(Calendar.DATE, durationOfLeague);  // number of days to ad
        newDate = LocalDate.parse(sdf.format(cTo.getTime()));


        Period duration = Period.between(oldDate, newDate);
        System.out.println("This league is scheduled to run for " + duration.getMonths() + " month(s), and " + duration.getDays() + " day's\n");
    }


    public Game[] createGame(Team[] teams, int numberOfGames, int numberOfPlayersInATeam) {
        PlayerDatabase playerDatabase = new PlayerDatabase();
        ArrayList<String> teamsNames = new ArrayList<>(Arrays.asList("Celsi", "Manchester United", "Bayern Muchen"));

        for (int i = 0; i < Game.getNumberOfTeams(); i++) {
            try {
                teams[i] = new Team(teamsNames.get(i), playerDatabase.getTeam(numberOfPlayersInATeam));
            } catch (PlayerDatabaseException e) {
                e.printStackTrace();
            }
        }
        Game[] games = new Game[numberOfGames];

        for (int i = 0; i < numberOfGames; i++) {
            games[i] = new Game(teams);
        }

        return games;
    }

    public void generateGames(int numberOfGames, int numberOfPlayersInAteam, int numberOfTeams) {
        Game.setNumberOfTeams(numberOfTeams);
        Game.setNumberOfGames(numberOfGames);
        League league = new League();
        Team[] teams = new Team[Game.getNumberOfTeams()];
        int durationOfLeague = numberOfGames * 7;

        //work with date
        LocalDate oldDate = LocalDate.of(2018, Month.NOVEMBER, 1);
        LocalDate newDate = LocalDate.of(2018, Month.NOVEMBER, 1);
        // LocalDate newDateTodis = LocalDate.of(2018, Month.NOVEMBER, 1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Calendar c = Calendar.getInstance();
        try {

            c.setTime(sdf.parse(String.valueOf(oldDate)));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        League.displayDurationOfLeague();

        for (Game games : league.createGame(teams, numberOfGames, numberOfPlayersInAteam)
        ) {
            int rand = Game.generateRandomValue(Game.getNumberOfTeams());
            int rand2 = Game.generateRandValueDifferentThatOriginRand(rand, 3);
            System.out.println(newDate);
            //incremente date by 7
            c.add(Calendar.DATE, 7);  // number of days to add
            newDate = LocalDate.parse(sdf.format(c.getTime()));


            Game.setSincronizeTeamGoals1(rand);
            Game.setSincronizeTeamGoals12(rand2);

            System.out.println(teams[rand].getTeamName() + " vs " + teams[rand2].getTeamName());
            games.playGame();
            System.out.println();

        }


        System.out.println("The points:");
        for (int i = 0; i < Game.getNumberOfTeams(); i++) {
            System.out.println("The " + teams[i].getTeamName() + " : " + teams[i].getTotalPointsTeam() + " : " + teams[i].getTotalScore());
        }
        Game.detectTheChampions(teams);
    }
}