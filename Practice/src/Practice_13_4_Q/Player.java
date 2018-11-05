package Practice_13_4_Q;

public class Player {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

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
