package de.paluch.ccd.dry;

/**
 * <br>
 * <br>
 * Project: CCD <br>
 * Autor: mark <br>
 * Created: 16.06.2012 <br>
 * <br>
 */
public class Good {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int[] monthsArray = { 12, 24, 36, 0, 0, 0, 0, 0, 0, 120 };

        for (int i = 0; i < monthsArray.length; i++) {
            int months = monthsArray[i];
            if (months > 0) {
                double rate = calculateRate(i + 1, months);
            }

        }

    }

    /**
     * @param variant
     * @param months
     * @return
     */
    private static double calculateRate(int variant, int months) {
        /*
         * magic.
         */
        return 0;
    }

}
