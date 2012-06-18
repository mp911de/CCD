package de.paluch.ccd.di.good;

import java.util.List;

import de.paluch.ccd.di.bad.LowLevelClass;

/**
 * <br>
 * <br>
 * Project: CCD <br>
 * Autor: mark <br>
 * Created: 18.06.2012 <br>
 * <br>
 */
public class HighLevelClass implements LoggingProvider {

    private final List<Executor> nested;

    /**
     * @param nested
     */
    public HighLevelClass(List<Executor> nested) {
        super();
        this.nested = nested;
    }

    /**
     * This method is exposed, but now, {@link LowLevelClass} uses a type-reference to {@link LoggingProvider}, so it
     * cannot access {@link #areThereOtherLowLevelClasses()} without performing ugly things.
     * 
     * @return
     */
    public boolean areThereOtherLowLevelClasses() {

        return !nested.isEmpty();

    }

    public void run() {
        for (Executor llc : nested) {
            llc.execute();
        }
    }

    /**
     * @param string
     */
    @Override
    public void log(String string) {

    }
}
