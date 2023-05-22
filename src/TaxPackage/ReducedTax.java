package TaxPackage;

import java.math.BigDecimal;

public class ReducedTax implements TaxInterface{
    @Override
    public BigDecimal calculateTax(BigDecimal price) {
        return BigDecimal.ZERO;
    }
}
