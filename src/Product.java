import TaxPackage.TaxInterface;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal price;
    private TaxInterface taxInterface;

    public Product(String name, BigDecimal price, TaxInterface taxInterface) {
        this.name = name;
        this.price = price;
        this.taxInterface = taxInterface;
    }

    public BigDecimal getTax() {
        return taxInterface.calculateTax(price);
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public TaxInterface getTaxInterface() {
        return taxInterface;
    }


    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setTaxInterface(TaxInterface taxInterface) {
        this.taxInterface = taxInterface;
    }

}
