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
    @Override
    public Product findMax() {
        Product maxProduct = null;
        int maxPrice = 0;
        for (Product p : productList) {
            if (p.getPrice() > maxPrice) {
                maxProduct = p;
                maxPrice = p.getPrice();
            }
        }
        return maxProduct;
    }
}
