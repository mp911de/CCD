package de.paluch.ccd.di.good;

/**
 * <br>
 * <br>
 * Project: CCD <br>
 * Autor: mark <br>
 * Created: 18.06.2012 <br>
 * <br>
 */
public class LowLevelClass implements Executor {

    private LoggingProvider logProvider;

    /**
     *
     */
    @Override
    public void execute() {
        logProvider.log("log statement");

    }

}
