package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student1 = new Student("Mary", "BA");
        System.out.println(student1.getGroupName());
        student1.printInfo();

        Teacher teacher1 = new Teacher("Anna", "Math");
        System.out.println(teacher1.getSubjectName());
        teacher1.printInfo();
    }
}
