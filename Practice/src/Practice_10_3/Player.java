package Practice_10_3;

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
