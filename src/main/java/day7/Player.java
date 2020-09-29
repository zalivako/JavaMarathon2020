package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static final int MAX_COUNT_PLAYERS = 6;
    public static int countPlayers = 0;

    public Player(int stamina) {
        if (countPlayers < MAX_COUNT_PLAYERS) {
            if (stamina <= MAX_STAMINA && stamina >= MIN_STAMINA) {
                this.stamina = stamina;
                countPlayers++;
            }
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
            if (stamina == MIN_STAMINA) {
                countPlayers--;
            }
        }
    }

    public static void info() {
        if (countPlayers < MAX_COUNT_PLAYERS) {
            switch (MAX_COUNT_PLAYERS - countPlayers) {
                case 1:
                    System.out.println("Команды неполные. На поле еще есть " + (MAX_COUNT_PLAYERS - countPlayers) + " свободное место");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("Команды неполные. На поле еще есть " + (MAX_COUNT_PLAYERS - countPlayers) + " свободных места");
                    break;
                case 5:
                case 6:
                    System.out.println("Команды неполные. На поле еще есть " + (MAX_COUNT_PLAYERS - countPlayers) + " свободных мест");
                    break;
            }
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
