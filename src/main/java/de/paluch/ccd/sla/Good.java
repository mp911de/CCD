package de.paluch.ccd.sla;

import java.io.FileNotFoundException;
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
public class Good {

    private final int maxNumberOfChars = -1;
    private final int maxCharsInLine = -1;

    int totalChars = 0;
    int totalLines = 0;

    OutputStream os;

    /**
     *
     */
    private void generate(String filename) throws IOException {

        prepareFile(filename);
        processData();

    }

    /**
     * @throws IOException
     */
    private void processData() throws IOException {
        while (totalLines < maxNumberOfChars) {
            String line = createLine();
            writeLine(line);
            checkAndUpdateProgress(line);
        }
    }

    /**
     * @return
     */
    private String createLine() {
        String line = "";
        while (line.length() < maxCharsInLine) {
            String word = "xy" + maxCharsInLine * Math.random();
            line += word + " ";
        }
        return line;
    }

    /**
     * @param line
     * @throws IOException
     */
    private void writeLine(String line) throws IOException {
        os.write(line.trim().getBytes());
    }

    /**
     * @param line
     */
    private void checkAndUpdateProgress(String line) {
        totalChars += line.length();
        totalLines++;
        if (totalLines % 1000 == 0) {
            updateProgress(totalLines, totalChars);
        }
    }

    /**
     * @param filename
     * @throws FileNotFoundException
     */
    private void prepareFile(String filename) throws FileNotFoundException {
        os = new FileOutputStream(filename);

    }

    /**
     * @param totalLines
     * @param totalChars
     */
    private void updateProgress(int totalLines, int totalChars) {
        // magic

    }
}
