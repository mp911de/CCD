package de.paluch.ccd.crefactoring.before;

/**
 * <br>
 * <br>
 * Project: CCD <br>
 * Autor: mark <br>
 * Created: 11.07.2012 <br>
 * <br>
 */
public class KomplexbyIkea {

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

    public String createAString(int number, int number2) {
        String result = "";
        result += number;

        if (!result.isEmpty()) {
            result += " this is a number";
        } else {
            result += " the string is empty until now";
        }

        result += number2;

        if (!result.isEmpty()) {
            result += " this is a number";
        } else {
            result += " the string is empty until now";
        }

        if (isInteger(result)) {
            result += " i'm an integer";
        }

        return result;
    }

    public String createAString(int number) {
        String result = "";
        result += number;

        if (!result.isEmpty()) {
            result += " this is a number";
        } else {
            result += " the string is empty until now";
        }

        if (isInteger(result)) {
            result += " i'm an integer";
        }

        return result;
    }

    public void methodThatKnowsTooMuch(int price, int customerType, int value, String name, String articleId,
            long accountId) {

    }

}
