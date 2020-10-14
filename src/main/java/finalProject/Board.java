package finalProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {
    public static final int SIDE = 10;
    public Cell[][] newBoard;
    public List<Ship> shipsOnTheBoard;

    public Board() {
        newBoard = new Cell[SIDE][SIDE];
        fillBoard(newBoard);
        shipsOnTheBoard = new ArrayList<>();
    }

    public void fillBoard(Cell[][] newBoard) {
        for (int y = 0; y < newBoard.length; y++) {
            for (int x = 0; x < newBoard[y].length; x++) {
                newBoard[y][x] = new Cell(Cell.WHITE);
            }
        }
    }

    public void printBoard() {
        for (Cell[] rowOfCell : this.newBoard) {
            for (Cell cell : rowOfCell) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean shipCoordinates(String s, int n) { // проверяем координаты корабля (формат: x,y;...)
        if (s.isEmpty()) {
            System.out.println("Пустая строка.");
            return false;
        } else if (!s.contains(";") && n > 1) {
            System.out.println("Неверный формат ввода данных.");
            return false;
        } else {
            String[] ss = s.split(";");
            if (ss.length != n) {
                System.out.println("Размер корабля не соответствует.");
                return false;
            } else {
                List<int[]> coordinates = new ArrayList<>(); // список для хранения координат
                for (int i = 0; i < ss.length; i++) {
                    if (!GameLogic.validCoordinates(ss[i])) { // проверка координат ячейки (формат: x,y)
                        return false;
                    } else {
                        String[] numbers = ss[i].split(",");
                        int x = Integer.parseInt(numbers[0]);
                        int y = Integer.parseInt(numbers[1]);

                        if (newBoard[y][x].isShip()) {
                            System.out.println("На данном месте уже есть корабль.");
                            return false;
                        } else if (newBoard[y][x].isArea()) {
                            System.out.println("Вокруг корабля должна быть область (ореол корабля) шириной в одну клетку, " +
                                    "в которой не могут находится другие корабли.");
                            return false;
                        } else {
                            coordinates.add(new int[]{x, y});
                        }
                    }
                }

                if (n > 1 && !shipReal(coordinates)) { // проверяем валидная ли расстановка ячеек корабля
                    return false;
                }
                shipInitialization(coordinates); // создаем объект корабля на основания списка координат, которые уже проверили на валидность
                return true;
            }
        }
    }

    private boolean shipReal(List<int[]> coordinates) {
        int[] xNumbers = new int[coordinates.size()];
        int[] yNumbers = new int[coordinates.size()];

        for (int i = 0; i < coordinates.size(); i++) {
            xNumbers[i] = coordinates.get(i)[0];
            yNumbers[i] = coordinates.get(i)[1];
        }
        Arrays.sort(xNumbers);
        Arrays.sort(yNumbers);

        for (int i = 1; i < coordinates.size(); i++) {
            if ((xNumbers[i - 1] == xNumbers[i] && yNumbers[i - 1] == yNumbers[i] - 1) ||
                    (yNumbers[i - 1] == yNumbers[i] && xNumbers[i - 1] == xNumbers[i] - 1)) {
                continue;
            } else {
                System.out.println("Неверные координаты для корабля.");
                return false;
            }
        }
        return true;
    }

    private void shipInitialization(List<int[]> coordinates) {
        for (int i = 0; i < coordinates.size(); i++) {
            int x = coordinates.get(i)[0];
            int y = coordinates.get(i)[1];
            newBoard[y][x].setSymbol(Cell.SHIP);
            newBoard[y][x].setShip(true);
            areaInitialization(x, y);
        }
        Ship newShipOnTheBoard = new Ship(this, coordinates); // создаем объект корабля
        shipsOnTheBoard.add(newShipOnTheBoard); // заносим в список доски новый корабль
    }

    private void areaInitialization(int x, int y) {
        for (int i = y - 1; i <= y + 1; i++) {
            for (int j = x - 1; j <= x + 1; j++) {
                if (i < 0 || i >= SIDE) {
                    continue;
                }
                if (j < 0 || j >= SIDE) {
                    continue;
                }
                if (!newBoard[i][j].isShip()) {
                    newBoard[i][j].setArea(true);
                    newBoard[i][j].setSymbol(Cell.AREA);
                }
            }
        }
    }
}
