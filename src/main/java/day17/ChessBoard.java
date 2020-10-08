package day17;

public class ChessBoard {
    private ChessPiece[][] newChessBoard;

    public ChessBoard(ChessPiece[][] newChessBoard) {
        this.newChessBoard = newChessBoard;
    }

    public void print() {
        for (ChessPiece[] rowChessBoard : newChessBoard) {
            for (ChessPiece chessPiece : rowChessBoard) {
                System.out.print(chessPiece);
            }
            System.out.println();
        }
    }
}
