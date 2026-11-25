import java.util.Comparator;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository{
    private List<Product> productList;

    public ProductRepositoryImpl(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product findById(int id) {
        return productList.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException());
    }

    /**
     * Find max product
     * @return max product of the Product class.
     */
    @Override
    public Product findMax() {
        return productList.stream()
                .max(Comparator.comparing(e -> e.getPrice()))
                .orElseThrow(() -> new IllegalMonitorStateException("Can not find max product"))
    }
    @Override
    public Product findMin() {
        return productList.stream()
                .min(Comparator.comparing(e -> e.getPrice()))
                .orElseThrow(() -> new IllegalStateException("Cannot find min"));
    }
}
