package de.paluch.ccd.kiss;

/**
 * <br>
 * <br>
 * Project: CCD <br>
 * Autor: mark <br>
 * Created: 16.06.2012 <br>
 * <br>
 */
public class Bad {

    private double im = 0;
    private double re = 0;

    //Konvertiere komplexe Zahl in String
    @Override
    public String toString() {
        if (im == 0) return Double.toString(re);
        if (re == 0) return im + " I";
        if (im < 0) return re + " - " + (-im) + " I";
        return re + " + " + im + " I";
    }

}
