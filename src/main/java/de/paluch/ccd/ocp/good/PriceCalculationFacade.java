package de.paluch.ccd.ocp.good;

import de.paluch.ccd.ocp.CustomerType;

/**
 * <br>
 * <br>
 * Project: CCD <br>
 * Autor: mark <br>
 * Created: 18.06.2012 <br>
 * <br>
 */
public class PriceCalculationFacade {

    private CustomerType customerType;

    public double calculatePrice(double amount, double singleUnitPrice) {

        CalculationStrategy strategy = getCalculationStrategy();
        return strategy.calculatePrice(amount, singleUnitPrice);
    }

    /**
     * @return
     */
    private CalculationStrategy getCalculationStrategy() {
        switch (customerType) {
            case NEW:
                return new NewCustomerCalculationStrategy();

            case EXISTING:
                return new ExistingCustomerCalculationStrategy();
            default:
                throw new IllegalArgumentException();
        }
    }
}
