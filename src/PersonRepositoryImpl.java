import java.util.List;

public class PersonRepositoryImpl implements PersonRepository {
    public List<Person> personList;

    public PersonRepositoryImpl(List<Person> personList) {
        this.personList = personList;
    }

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

    @Override
    public Person findMax() {
        Person person = null;
        int balance = 0;
        for (Person p : personList) {
            if (p.getBalance() > balance) {
                balance = p.getBalance();
                person = p;
            }
        }
        return person;
    }

    @Override
    public int personsTotalBalance() throws Exception {
        int totalBalance=0;
        for (Person p : personList) {
            totalBalance = p.getBalance() + totalBalance;
        }
        if (totalBalance == 0) {
            throw new Exception("Total Balance is 0");
        }
        return totalBalance;
    }


}
