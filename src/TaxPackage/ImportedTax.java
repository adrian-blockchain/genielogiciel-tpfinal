package TaxPackage;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ImportedTax implements TaxInterface {
    @Override
    public BigDecimal calculateTax(BigDecimal price) {
        return price.multiply(new BigDecimal("0.05")).setScale(2, RoundingMode.HALF_UP);
    }
}