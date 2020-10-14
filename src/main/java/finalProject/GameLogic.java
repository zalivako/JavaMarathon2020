package finalProject;

import java.util.Scanner;

public class GameLogic {

    public static void moveFirst(Player player1, Player player2) {
        int a = (int) (Math.random() * 2);
        if (a == 1) {
            GameLogic.move(player1, player2);
        } else {
            GameLogic.move(player2, player1);
        }
    }

    public static void scannerShipCoordinates(int n, Board board) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (!board.shipCoordinates(s, n)) {
            System.out.println("Введите данные повторно.");
            scannerShipCoordinates(n, board);
        }
    }

    public static void start(Board board) {
        System.out.println("Введите координаты 4-палубного корабля (формат: x,y;x,y;x,y;x,y).");
        scannerShipCoordinates(4, board);

        System.out.println("Введите координаты первого 3-палубного корабля (формат: x,y;x,y;x,y).");
        scannerShipCoordinates(3, board);

        System.out.println("Введите координаты второго 3-палубного корабля (формат: x,y;x,y;x,y).");
        scannerShipCoordinates(3, board);

        System.out.println("Введите координаты первого 2-палубного корабля (формат: x,y;x,y).");
        scannerShipCoordinates(2, board);

        System.out.println("Введите координаты второго 2-палубного корабля (формат: x,y;x,y).");
        scannerShipCoordinates(2, board);

        System.out.println("Введите координаты третьего 2-палубного корабля (формат: x,y;x,y).");
        scannerShipCoordinates(2, board);

        System.out.println("Введите координаты первого 1-палубного корабля (формат: x,y).");
        scannerShipCoordinates(1, board);

        System.out.println("Введите координаты второго 1-палубного корабля (формат: x,y).");
        scannerShipCoordinates(1, board);

        System.out.println("Введите координаты третьего 1-палубного корабля (формат: x,y).");
        scannerShipCoordinates(1, board);

        System.out.println("Введите координаты четвертого 1-палубного корабля (формат: x,y).");
        scannerShipCoordinates(1, board);

        board.printBoard();
    }

    public static boolean validCoordinates(String s) {
        if (s.isEmpty()) {
            System.out.println("Пустая строка.");
            return false;
        } else if (!s.contains(",")) {
            System.out.println("Неверный формат ввода данных.");
            return false;
        } else {
            String[] coordinates = s.split(",");
            int x;
            int y;
            try {
                x = Integer.parseInt(coordinates[0]);
                y = Integer.parseInt(coordinates[1]);
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Некорректные координаты. Необходимо ввести числа от 0 до 9.");
                return false;
            }
            if (x < 0 || x > 9 || y < 0 || y > 9) {
                System.out.println("Некорректные координаты. Необходимо ввести числа от 0 до 9.");
                return false;
            }
            return true;
        }
    }

    public static void move(Player player1, Player player2) {
        System.out.println("Ходит игрок " + player1.getName() + ". Введите координаты (формат: x,y).");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if (!validCoordinates(s)) {
            System.out.println("Повторите ввод.");
            move(player1, player2);
        } else {
            String[] numbers = s.split(",");
            int x = Integer.parseInt(numbers[0]);
            int y = Integer.parseInt(numbers[1]);

            // проверка попадания
            if (!player2.board.newBoard[y][x].isAlive()) { //
                System.out.println("Ячейка была уже открыта. Повторите ввод.");
                move(player1, player2);
            } else if (!player2.board.newBoard[y][x].isShip()) { // мимо. переход хода другому игроку
                System.out.println("Мимо. Ход следующего игрока.");
                player2.board.newBoard[y][x].setAlive(false);
                player2.board.newBoard[y][x].setSymbol(Cell.OFF_THE_TARGET);
                move(player2, player1);
            } else { // попадание. еще ход
                player2.board.newBoard[y][x].setAlive(false);
                player2.board.newBoard[y][x].setSymbol(Cell.HIT_THE_TARGET);

                int counter = player2.board.shipsOnTheBoard.size(); // количество кораблей на доске до выстрела
                for (int i = 0; i < player2.board.shipsOnTheBoard.size(); i++) {
                    if (!player2.board.shipsOnTheBoard.get(i).shipAlive()) {
                        player2.board.shipsOnTheBoard.remove(i); // удаляем корабль, если у него нет "живых" ячеек
                        break;
                    }
                }
                if (counter != player2.board.shipsOnTheBoard.size()) { // если количество короблей на доске изменилось
                    System.out.println("Потопил.");
                } else {
                    System.out.println("Попал.");
                }
                // проверка закончилась ли игра
                if (player2.board.shipsOnTheBoard.size() == 0) {
                    System.out.println("Игра завершилась. Победил игрок под именем " + player1.getName() + ".");
                    System.out.println("Доска победителя:");
                    player1.board.printBoard();
                    System.out.println("Доска проигравшего:");
                    player2.board.printBoard();
                } else {
                    move(player1, player2);
                }
            }
        }
    }
}
