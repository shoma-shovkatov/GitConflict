public interface PersonRepository {
    void findById(int id);

    Person findMax();

    int personsTotalBalance() throws Exception;
}
