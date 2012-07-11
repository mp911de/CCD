package de.paluch.ccd.crefactoring.after;

/**
 * <br>
 * <br>
 * Project: CCD <br>
 * Autor: mark <br>
 * Created: 11.07.2012 <br>
 * <br>
 */
public class Utility {

    /**
     * Utility constructor.
     */
    private Utility() {

    }

    public static boolean isInteger(String input) {
        try {
            if (input == null) {
                return false;
            }
    
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    
    }
}
