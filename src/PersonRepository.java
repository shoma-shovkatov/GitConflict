public interface PersonRepository {
    void findById(int id);

    Person findMax();
}
