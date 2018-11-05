package Practice_6_3;

public class Player {

    private String name;


    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        return this.name;
    }
}
