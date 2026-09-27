package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    static void main() {
        Person person1 = new Person("Lucia", LocalDate.of(2005, 3, 2));
        Person person2 = new Person("Lucia", LocalDate.of(2029, 3, 2));

        if (person1.age() != 21) {
            System.out.println("Person1 age is not 21");
            return;
        }

        if (person2.age() != -2) {
            System.out.println("Person2 age is not -2");
            return;
        }

        System.out.println("Tests success");
    }
}
