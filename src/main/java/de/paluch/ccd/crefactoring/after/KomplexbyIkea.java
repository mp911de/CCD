package de.paluch.ccd.crefactoring.after;

/**
 * <br>
 * <br>
 * Project: CCD <br>
 * Autor: mark <br>
 * Created: 11.07.2012 <br>
 * <br>
 */
public class KomplexbyIkea implements Kalkulator {

    /**
     * @see de.paluch.ccd.crefactoring.after.Kalkulator#kalkulat(int)
     */
    @Override
    public int kalkulat(int multiplier) {
        int smorebrod = 1;
        int elk = 2;
        int billy = 3;

        int resultat = smorebrod + elk;

        resultat += elk * multiplier;
        resultat += billy;
        resultat *= elk;

        return resultat;

    }

    public String createAString(int number, int number2) {
        String result = "";
        result += number;

        result = extendString(result);

        result += number2;

        result = extendString(result);

        if (Utility.isInteger(result)) {
            result += " i'm an integer";
        }

        return result;
    }

    /**
     * @param result
     * @return
     */
    private String extendString(String result) {
        if (!result.isEmpty()) {
            result += " this is a number";
        } else {
            result += " the string is empty until now";
        }
        return result;
    }

    public String createAString(int number) {
        String result = "";
        result += number;

        result = extendString(result);

        if (Utility.isInteger(result)) {
            result += " i'm an integer";
        }

        return result;
    }

    public void methodThatKnowsTooMuch(Context context) {

    }

}
