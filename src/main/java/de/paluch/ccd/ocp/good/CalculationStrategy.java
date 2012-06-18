package de.paluch.ccd.ocp.good;

/**
 * <br>
 * <br>
 * Project: CCD <br>
 * Autor: mark <br>
 * Created: 18.06.2012 <br>
 * <br>
 */
public interface CalculationStrategy {

    double calculatePrice(double amount, double singleUnitPrice);
}
