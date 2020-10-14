package finalProject;

public class Player {
    private String name;
    Board board;

    public Player(String name, Board board) {
        this.name = name;
        this.board = board;
    }

    public String getName() {
        return name;
    }
}
