package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] chessPieces = new ChessPiece[8];

        for (int i = 0; i < 4; i++) {
            chessPieces[i] = ChessPiece.PAWN_WHITE;
            chessPieces[i + 4] = ChessPiece.ROOK_BLACK;
        }

        for (ChessPiece chessPiece : chessPieces) {
            System.out.print(chessPiece + " ");
        }
    }
}
