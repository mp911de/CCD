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
public class Bad {

    private boolean success = false;

    public void getData() throws Exception {
        success = File.createTempFile("aaaa", ".bbb").delete();
    }

}
