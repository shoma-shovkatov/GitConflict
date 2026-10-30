import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {


        Person person1 = new Person(1, "SHams", "Shovkatov", 32, 1000, LocalDate.of(2020, 12, 1), "cars");
        Person person2 = new Person(2, "Pavel", "Pan", 38, 3000, LocalDate.of(2026, 11, 1), "cars");

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);

        PersonRepository personRepository = new PersonRepositoryImpl(personList);
        Person p = personRepository.findMax();
        System.out.println(p);

        PersonRepository personRepository1 = new PersonRepositoryImpl(personList);
        int totalBalance = personRepository.personsTotalBalance();
        System.out.println(totalBalance);

    }
}
