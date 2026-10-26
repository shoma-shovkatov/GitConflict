import java.util.List;

public class PersonRepositoryImpl implements PersonRepository {
    public List<Person> personList;

    @Override

    public void findById(int id) {
        Person persons = null;
        for (Person person : personList) {
            if (person.getId() == id) {
                persons = person;
            }
        }
        System.out.println(persons);
    }
}
