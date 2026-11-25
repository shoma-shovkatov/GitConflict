public interface ProductRepository {
    Product findById(int id);

    Product findMax();

    Product findMin();
}
