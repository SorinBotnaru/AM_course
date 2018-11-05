package Practice_12_5_AND_15_2;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;

public class Game {

    private static int numberOfTeams;
    private static int sincronizeTeamGoals;
    private static int sincronizeTeamGoals2;
    private static int numberOfGames;

    public static void setNumberOfGames(int numberOfGames) {
        Game.numberOfGames = numberOfGames;
    }

    public static int getNumberOfGames() {
        return numberOfGames;
    }

    private Team[] teams;

    public Game(Team[] teams) {
        this.teams = teams;
    }

    public Game() {

    }

    public static int getSincronizeTeamGoals2() {
        return sincronizeTeamGoals2;
    }

    public static int getSincronizeTeamGoals() {
        return sincronizeTeamGoals;
    }

    public static void setSincronizeTeamGoals12(int sincronizeTeamGoals2) {
        Game.sincronizeTeamGoals2 = sincronizeTeamGoals2;
    }

    public static void setSincronizeTeamGoals1(int sincronizeTeamGoals) {
        Game.sincronizeTeamGoals = sincronizeTeamGoals;
    }

    public static int getNumberOfTeams() {
        return numberOfTeams;
    }

    public static void setNumberOfTeams(int numberOfTeams) {
        Game.numberOfTeams = numberOfTeams;
    }

    public static void detectTheChampions(Team[] arr) {

        int toCompare = arr[0].getTotalScore();
        int index = 0;
        for (int i = 0; i < numberOfTeams; i++) {
            if (arr[i].getTotalScore() > toCompare) {
                toCompare = arr[i].getTotalScore();
                index = i;
            }

        }
        System.out.println("This year's champions are: " + arr[index].getTeamName() + ", with total score: " + toCompare);

    }


    public static int generateRandValueDifferentThatOriginRand(int randVal, int numberToGenerate) {
        int randHelp = (int) (Math.random() * numberToGenerate);
        while (randHelp == randVal) {
            randHelp = (int) (Math.random() * numberToGenerate);
        }
        return randHelp;
    }

    public static int generateRandomValue(int rangeOfNumbers) {
        return (int) (Math.random() * rangeOfNumbers);
    }

    public static int generateAnumberInrangeOfTwo(int number1, int number2) {
        Random random = new Random();
        int rand = 0;
        rand = random.nextInt((number1 > number2 ? number1 : number2) + (number1 > number2 ? number1 : number2));
        while (rand != number1 || rand != number2) {
            if (rand == number1 || rand == number2) {
                return rand;
            } else {
                rand = random.nextInt((number1 > number2 ? number1 : number2) + (number1 > number2 ? number1 : number2));
            }

        }

        return rand;
    }

    public void playGame(int numberOfGoals) {
        Random random = new Random();
        int countTeam1 = 0;
        int countTeam2 = 0;

        int randTeam = 0;


        HashSet<Integer> hash_Set = new HashSet<Integer>();

        Map<Integer, Integer> store = new HashMap<>();

        for (int i = 0; i < Game.getNumberOfTeams(); i++) {
            store.put(i, 0);
        }

        for (int i = 0; i < numberOfGoals; i++) {
            randTeam = generateAnumberInrangeOfTwo(Game.getSincronizeTeamGoals(), Game.getSincronizeTeamGoals2());

            if (store.containsKey(randTeam)) {
                store.put(randTeam, store.get(randTeam) + (+1));
                teams[randTeam].setTotalScore(1);
            }

            hash_Set.add(randTeam);
            new Goal(Math.random() * 45.0, teams[randTeam], teams[randTeam].getPlayers()[(int) (Math.random() * 4)]);
        }
        if (hash_Set.size() == 1 && (!hash_Set.isEmpty())) {
            countTeam1 = (int) hash_Set.toArray()[0];
            countTeam1 = (int) hash_Set.toArray()[0];
        } else if (hash_Set.size() > 1) {
            countTeam1 = (int) hash_Set.toArray()[0];
            countTeam2 = (int) hash_Set.toArray()[1];
        }

        System.out.println();

        int theWiner = 0;
        if (store.get(countTeam1) > store.get(countTeam2)) {
            theWiner = countTeam1;
        } else {
            theWiner = countTeam2;
        }

        if (countTeam1 != countTeam2) {
            System.out.println("The " + teams[theWiner].getTeamName() + " win " + "(" + store.get(countTeam1) + "-" + store.get(countTeam2) + ")");
            teams[theWiner].setTotalPointsTeam(2);
        } else if (countTeam1 == countTeam2) {
            System.out.println("It's a draw !  " + "(" + store.get(countTeam1) + "-" + store.get(countTeam2) + ")");
            teams[countTeam1].setTotalPointsTeam(2);
            teams[countTeam2].setTotalPointsTeam(2);

        }

    }

    public void playGame() {
        Random random = new Random();
        int countTeam1 = 0;
        int countTeam2 = 0;

        int randTeam = 0;
        int randomNumberOfGoals = random.nextInt(6) + 1;

        HashSet<Integer> hash_Set = new HashSet<Integer>();

        Map<Integer, Integer> store = new HashMap<>();

        for (int i = 0; i < Game.getNumberOfTeams(); i++) {
            store.put(i, 0);
        }

        for (int i = 0; i < randomNumberOfGoals; i++) {
            randTeam = generateAnumberInrangeOfTwo(Game.getSincronizeTeamGoals(), Game.getSincronizeTeamGoals2());

            if (store.containsKey(randTeam)) {
                store.put(randTeam, store.get(randTeam) + (+1));
                teams[randTeam].setTotalScore(1);
            }

            hash_Set.add(randTeam);
            new Goal(Math.random() * 45.0, teams[randTeam], teams[randTeam].getPlayers()[(int) (Math.random() * 4)]);
        }
        if (hash_Set.size() == 1 && (!hash_Set.isEmpty())) {
            countTeam1 = (int) hash_Set.toArray()[0];
            countTeam1 = (int) hash_Set.toArray()[0];
        } else if (hash_Set.size() > 1) {
            countTeam1 = (int) hash_Set.toArray()[0];
            countTeam2 = (int) hash_Set.toArray()[1];
        }


        System.out.println();

        int theWiner = 0;
        if (store.get(countTeam1) > store.get(countTeam2)) {
            theWiner = countTeam1;
        } else {
            theWiner = countTeam2;
        }

        if (store.get(countTeam1) != store.get(countTeam2)) {
            System.out.println("The " + teams[theWiner].getTeamName() + " win " + "(" + store.get(countTeam1) + "-" + store.get(countTeam2) + ")");
            teams[theWiner].setTotalPointsTeam(2);
        } else if (store.get(countTeam1) == store.get(countTeam2)) {
            System.out.println("It's a draw !  " + "(" + store.get(countTeam1) + "-" + store.get(countTeam2) + ")");
            teams[countTeam1].setTotalPointsTeam(2);
            teams[countTeam2].setTotalPointsTeam(2);

        }

    }
}



