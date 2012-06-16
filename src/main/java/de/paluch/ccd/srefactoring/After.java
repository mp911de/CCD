package de.paluch.ccd.srefactoring;

/**
 * <br>
 * <br>
 * Project: CCD <br>
 * Autor: mark <br>
 * Created: 16.06.2012 <br>
 * <br>
 */
public class After {

    private int process(String input) {
        return 1;
    }

    private void calc() {

        String input = getStandardInput();
        process(input);
    }

    private void doSomething() {
        String input = getStandardInput();
        process(input);
    }

    private void doSomethingElse() {
        process("");
    }

    /**
     * @return
     */
    private String getStandardInput() {
        String input = "zero";
        input += ":one";
        input += ":two";
        return input;
    }
}
