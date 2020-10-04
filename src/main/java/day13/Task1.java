package day13;

import static day13.MessageDatabase.*;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Tom");
        User user2 = new User("Bob");
        User user3 = new User("Mike");

        addNewMessage(user1, user2, "Под небом голубым");
        addNewMessage(user1, user2, "Есть город золотой");

        addNewMessage(user2, user1, "С прозрачными воротами");
        addNewMessage(user2, user1, "И яркую звездой");
        addNewMessage(user2, user1, "А в городе том сад");

        addNewMessage(user3, user1, "Все травы да цветы");
        addNewMessage(user3, user1, "Гуляют там животные");
        addNewMessage(user3, user1, "Невиданной красоты");

        addNewMessage(user1, user3, "Одно как жёлтый, огнегривый лев");
        addNewMessage(user1, user3, "Другое - вол, исполненыый очей");
        addNewMessage(user1, user3, "С ними золотой орёл небесный");

        addNewMessage(user3, user1, "Чей так светел взор незабываемый");

        showDialog(user1, user3);

        System.out.println(getMessages().get(0));
    }
}