package day7;

public class Task2 {
    public static void main(String[] args) {
        Player.info();
        Player player1 = new Player(Task2.randomNumber());
        Player player2 = new Player(Task2.randomNumber());
        Player.info();
        Player player3 = new Player(Task2.randomNumber());
        Player player4 = new Player(Task2.randomNumber());
        Player player5 = new Player(Task2.randomNumber());
        Player player6 = new Player(Task2.randomNumber());
        Player.info();
        Player player7 = new Player(Task2.randomNumber());
        Player player8 = new Player(Task2.randomNumber());
        Player.info();

        for (int i = player1.getStamina(); i >= 0; i--) {
            player1.run();
        }
        Player.info();
    }

    public static int randomNumber() {
        int random = (Player.MAX_STAMINA - 10) + (int) (Math.random() * 11); // [90, 100]
        return random;
    }
}
