package finalProject;

public class SeaBattleGame {
    public static void main(String[] args) {
        Board board1 = new Board();
        Player player1 = new Player("Tom", board1);
        System.out.println("Игрок " + player1.getName() + " расставляет корабли.");
        GameLogic.start(board1);

        Board board2 = new Board();
        Player player2 = new Player("Jerry", board2);
        System.out.println("Игрок " + player2.getName() + " расставляет корабли.");
        GameLogic.start(board2);

        GameLogic.moveFirst(player1, player2);
    }
}