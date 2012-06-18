package de.paluch.ccd.di.bad;

import java.util.List;

/**
 * <br>
 * <br>
 * Project: CCD <br>
 * Autor: mark <br>
 * Created: 18.06.2012 <br>
 * <br>
 */
public class HighLevelClass {

    private List<LowLevelClass> nested;

    /**
     * This method is exposed. Due the fact, {@link LowLevelClass} uses directly a type-reference to
     * {@link HighLevelClass} it could access {@link #areThereOtherLowLevelClasses()}.
     * 
     * @return
     */
    public boolean areThereOtherLowLevelClasses() {
        return !nested.isEmpty();

    }

    public void run() {
        for (LowLevelClass llc : nested) {
            llc.execute();
        }
    }

    /**
     * @param string
     */
    public void log(String string) {

    }
}
