package de.paluch.ccd.srefactoring;

/**
 * <br>
 * <br>
 * Project: CCD <br>
 * Autor: mark <br>
 * Created: 16.06.2012 <br>
 * <br>
 */
public class Before {

    private int IAmAMethodWithAReallyLongAndAnnoyingName(String input) {
        return 1;
    }

    private void calc() {

        String input = "zero";
        input += ":one";
        input += ":two";

        IAmAMethodWithAReallyLongAndAnnoyingName(input);
    }

    private void doSomething() {
        String input = "zero";
        input += ":one";
        input += ":two";
        IAmAMethodWithAReallyLongAndAnnoyingName(input);
    }

    private void doSomethingElse() {
        IAmAMethodWithAReallyLongAndAnnoyingName("");
    }
}
