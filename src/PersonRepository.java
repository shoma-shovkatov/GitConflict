import java.util.List;

public interface PersonRepository {
    void findById(int id);

    Person findMax();

    int personsTotalBalance() throws Exception;

    List<Person> findByDate(int year);

    long getAmountWithNegativeBalance();
}
