import TaxPackage.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceTest {
    private Invoice invoice;

    @BeforeEach
    public void setup() {
        List<Product> products = new ArrayList<>();

        TaxInterface regularTax = new RegularTax();
        TaxInterface reducedTax = new ReducedTax();
        TaxInterface importTax = new ImportedTax();

        products.add(new Product("flacon de parfum importé", new BigDecimal("27.99"), new MultipleTaxes(regularTax, importTax)));
        products.add(new Product("flacon de parfum", new BigDecimal("18.99"), regularTax));
        products.add(new Product("boite de pilule contre la migraine", new BigDecimal("9.75"), reducedTax));
        products.add(new Product("boite de chocolats importés", new BigDecimal("11.25"), new MultipleTaxes(reducedTax, importTax)));

        invoice = new Invoice(products);
    }

    @Test
    public void testTotalTax() {
        BigDecimal expectedTax = new BigDecimal("6.70");
        BigDecimal actualTax = invoice.getTotalTax();
        assertEquals(expectedTax, actualTax);
    }

    @Test
    public void testTotalPrice() {
        BigDecimal expectedTotal = new BigDecimal("74.68");
        BigDecimal actualTotal = invoice.getTotalPrice();
        assertEquals(expectedTotal, actualTotal);
    }
}
