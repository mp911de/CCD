package de.paluch.ccd.sla;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * <br>
 * <br>
 * Project: CCD <br>
 * Autor: mark <br>
 * Created: 18.06.2012 <br>
 * <br>
 */
public class Bad {

    private final int maxNumberOfChars = -1;
    private final int maxCharsInLine = -1;

    /**
     *
     */
    private void generate(String filename) throws IOException {
        int totalChars = 0;
        int totalLines = 0;
        OutputStream os = new FileOutputStream(filename);
        while (totalLines < maxNumberOfChars) {
            String line = "";
            while (line.length() < maxCharsInLine) {
                String word = "xy" + maxCharsInLine * Math.random();
                line += word + " ";
            }

            os.write(line.trim().getBytes());
            totalChars += line.length();
            totalLines++;

            if (totalLines % 1000 == 0) {
                updateProgress(totalLines, totalChars);
            }
        }

    }

    /**
     * @param totalLines
     * @param totalChars
     */
    private void updateProgress(int totalLines, int totalChars) {
        // magic

    }
}
