package TaxPackage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

public class MultipleTaxes implements TaxInterface {
    private final List<TaxInterface> taxInterfaceList;



    public MultipleTaxes(TaxInterface... taxInterfaces) {
        this.taxInterfaceList = Arrays.asList(taxInterfaces);
    }

    @Override
    public BigDecimal calculateTax(BigDecimal price) {
        return taxInterfaceList.stream()
                .map(strategy -> strategy.calculateTax(price))
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO)
                .setScale(1, RoundingMode.HALF_UP);
    }
}
