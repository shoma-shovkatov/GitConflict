import java.util.List;

public class ProductRepositoryImpl implements ProductRepository{
    private List<Product> productList;

    public ProductRepositoryImpl(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product findById(int id) {
        return null;
    }
}
