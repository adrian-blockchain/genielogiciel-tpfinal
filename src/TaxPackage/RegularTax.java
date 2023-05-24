package TaxPackage;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RegularTax implements TaxInterface{
    @Override
    public BigDecimal calculateTax(BigDecimal price) {
        return price.multiply(new BigDecimal("0.10")).setScale(1, RoundingMode.HALF_UP);
    }


}
