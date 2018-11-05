package Practice_8_3;

public class Game {


    private Team []teams=new Team[2];



    public Game( Team[]teams) {

        this.teams=teams;


    }

    public Game() {
    }

    public  void playGame(int numberOfGoals){


        for (int i = 0; i <numberOfGoals ; i++) {
            int randTeam= (int) (Math.random()*2);
            new Goal(Math.random()*45.0, teams[randTeam], teams[randTeam].players[(int) (Math.random() * 3)]);
        }
        }

    public  void playGame(){


        for (int i = 0; i <6 ; i++) {
            int randTeam= (int) (Math.random()*2);
            new Goal(Math.random()*45.0, teams[randTeam], teams[randTeam].players[(int) (Math.random() * 3)]);
        }
    }

    }



