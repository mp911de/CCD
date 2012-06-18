package de.paluch.ccd.ocp.good;

/**
 * <br>
 * <br>
 * Project: CCD <br>
 * Autor: mark <br>
 * Created: 18.06.2012 <br>
 * <br>
 */
public class NewCustomerCalculationStrategy implements CalculationStrategy {

    /**
     * @see de.paluch.ccd.ocp.good.CalculationStrategy#calculatePrice(double, double)
     */
    @Override
    public double calculatePrice(double amount, double singleUnitPrice) {

        return amount * singleUnitPrice;
    }

}
