package software.ulpgc.katas;

public class Main {
    static void main() {
        Student student = new Student("Pepito", "Grillo");
        System.out.println(student.gradePercentage(20, 500));
    }
}
