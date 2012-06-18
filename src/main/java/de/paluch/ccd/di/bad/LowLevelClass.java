package de.paluch.ccd.di.bad;

/**
 * <br>
 * <br>
 * Project: CCD <br>
 * Autor: mark <br>
 * Created: 18.06.2012 <br>
 * <br>
 */
public class LowLevelClass {

    private HighLevelClass parent;

    /**
     *
     */
    public void execute() {
        parent.log("log statement");

    }

}
