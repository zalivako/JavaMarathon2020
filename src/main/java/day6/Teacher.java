package day6;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student, int mark) {
        if (mark >= 2 && mark <= 5) {
            String estimation = "";
            switch (mark) {
                case 2:
                    estimation = "неудовлетворительно";
                    break;
                case 3:
                    estimation = "удовлетворительно";
                    break;
                case 4:
                    estimation = "хорошо";
                    break;
                case 5:
                    estimation = "отлично";
                    break;
            }
            System.out.println("Преподаватель " + name +
                    " оценил студента с именем " + student.getName() +
                    " по предмету " + subject +
                    " на оценку " + estimation + ".");
        } else {
            System.out.println("Неправильная оценка");
        }
    }
}
