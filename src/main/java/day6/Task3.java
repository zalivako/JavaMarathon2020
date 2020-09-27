package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Иванов И.И.", "Высшая математика");
        Student student1 = new Student("Петров П.П.");
        teacher1.evaluate(student1, 5);
    }
}
