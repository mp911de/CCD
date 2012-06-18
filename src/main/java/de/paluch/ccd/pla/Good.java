package de.paluch.ccd.pla;

import java.io.File;

/**
 * <br>
 * <br>
 * Project: CCD <br>
 * Autor: mark <br>
 * Created: 18.06.2012 <br>
 * <br>
 */
public class Good {

    private boolean tempFileCreatedAndDeleted = false;

    public void checkIO() throws Exception {
        tempFileCreatedAndDeleted = File.createTempFile("aaaa", ".bbb").delete();
    }

    /**
     * @return the tempFileCreatedAndDeleted
     */
    public boolean isTempFileCreatedAndDeleted() {
        return tempFileCreatedAndDeleted;
    }

}
