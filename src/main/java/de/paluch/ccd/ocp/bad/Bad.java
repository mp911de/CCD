package de.paluch.ccd.ocp.bad;

import de.paluch.ccd.ocp.CustomerType;

/**
 * <br>
 * <br>
 * Project: CCD <br>
 * Autor: mark <br>
 * Created: 18.06.2012 <br>
 * <br>
 */
public class Bad {

    private CustomerType customerType;

    public double calculatePrice(double amount, double singleUnitPrice) {
        double Rebatte = 0.95;

        switch (customerType) {
            case NEW:
                return amount * singleUnitPrice;

            case EXISTING:
                return amount * singleUnitPrice * Rebatte;
            default:
                throw new IllegalArgumentException();
        }
    }
}
