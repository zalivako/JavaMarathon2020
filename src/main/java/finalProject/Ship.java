package finalProject;

import java.util.List;

public class Ship {
    Board board;
    List<int[]> coordinates;
    boolean isShipAlive;

    public Ship(Board board, List<int[]> list) {
        this.board = board;
        coordinates = list;
        isShipAlive = true;
    }

    public boolean shipAlive() {
        for (int i = 0; i < coordinates.size(); i++) {
            int x = coordinates.get(i)[0];
            int y = coordinates.get(i)[1];
            if (board.newBoard[y][x].isAlive()) {
                return true;
            }
        }
        return false;
    }
}
