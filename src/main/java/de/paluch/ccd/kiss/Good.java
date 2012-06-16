package de.paluch.ccd.kiss;

/**
 * <br>
 * <br>
 * Project: CCD <br>
 * Autor: mark <br>
 * Created: 16.06.2012 <br>
 * <br>
 */
public class Good {

    private static final String IMAGINARY_SUFFIX = " I";

    private final double real = 0;
    private final double imaginary = 0;

    private String createString() {

        if (imaginary == 0) {
            return createRealString();
        }

        if (real == 0) {
            return createImaginaryString();
        }

        StringBuffer buffer = new StringBuffer();
        buffer.append(createRealString());

        if (imaginary < 0) {
            buffer.append(" - ");

        } else {
            buffer.append(" + ");
        }

        buffer.append(createImaginaryString());

        return buffer.toString();
    }

    private String createRealString() {
        return "" + real;
    }

    private String createImaginaryString() {
        return imaginary + IMAGINARY_SUFFIX;
    }

    /**
     * Konvertiere komplexe Zahl in String
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return createString();
    }

}
