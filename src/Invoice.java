import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Invoice {
    private final List<Product> products;

    public Invoice(List<Product> products) {
        this.products = products;
    }

    public BigDecimal getTotalTax() {
        return products.stream()
                .map(Product::getTax)
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO)
                .setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getTotalPrice() {
        return products.stream()
                .map(product -> product.getPrice().add(product.getTax()))
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO)
                .setScale(2, RoundingMode.HALF_UP);
    }

    // getters and setters
}
