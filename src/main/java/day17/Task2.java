package day17;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] chessPieces = new ChessPiece[8][8];
        for (ChessPiece[] rowChessPiece : chessPieces) {
            Arrays.fill(rowChessPiece, ChessPiece.EMPTY);
        }
//8
        chessPieces[0][0] = ChessPiece.ROOK_BLACK;
        chessPieces[0][5] = ChessPiece.ROOK_BLACK;
        chessPieces[0][6] = ChessPiece.KING_BLACK;
//7
        chessPieces[1][1] = ChessPiece.ROOK_WHITE;
        chessPieces[1][4] = ChessPiece.PAWN_BLACK;
        chessPieces[1][5] = ChessPiece.PAWN_BLACK;
        chessPieces[1][7] = ChessPiece.PAWN_BLACK;
//6
        chessPieces[2][0] = ChessPiece.PAWN_BLACK;
        chessPieces[2][2] = ChessPiece.KNIGHT_BLACK;
        chessPieces[2][6] = ChessPiece.PAWN_BLACK;
//5
        chessPieces[3][0] = ChessPiece.QUEEN_BLACK;
        chessPieces[3][3] = ChessPiece.BISHOP_WHITE;
//4
        chessPieces[4][3] = ChessPiece.BISHOP_BLACK;
        chessPieces[4][4] = ChessPiece.PAWN_WHITE;
//3
        chessPieces[5][4] = ChessPiece.BISHOP_WHITE;
        chessPieces[5][5] = ChessPiece.PAWN_WHITE;
//2
        chessPieces[6][0] = ChessPiece.PAWN_WHITE;
        chessPieces[6][3] = ChessPiece.QUEEN_WHITE;
        chessPieces[6][5] = ChessPiece.PAWN_WHITE;
        chessPieces[6][7] = ChessPiece.PAWN_WHITE;
//1
        chessPieces[7][5] = ChessPiece.ROOK_WHITE;
        chessPieces[7][6] = ChessPiece.KING_WHITE;

        ChessBoard chessBoard = new ChessBoard(chessPieces);
        chessBoard.print();
    }
}
