import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.List;

public class DiscountService {
    double discount() {
        return 0.8;
    }

    void saveAll(List<String> users) {
        System.out.println(users);
    }

    void showAllAge(Scanner scanner) throws FileNotFoundException {
        Scanner scanner1 = new Scanner(new File("file.txt"));
    }

    void saveTotalBalance(List<String> balance) {
        for (String x : balance) {
            System.out.println(x);
        }
    }
    void soutAll(Scanner scanner) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter name");
    }

    void birthdayView(Person person) {
        System.out.println(person.getBirthday());
    }

}
