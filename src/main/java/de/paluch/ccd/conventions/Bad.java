package de.paluch.ccd.conventions;

import java.io.Serializable;

/**
 * <br>
 * <br>
 * Project: CCD <br>
 * Autor: mark <br>
 * Created: 18.06.2012 <br>
 * <br>
 */
public class Bad {

    public String Länge;
    private String priceInMMWithTolerance; int l;
    private CharSequence csq;

    String getLen()
    {
        return Länge;
    }

    private int Length()
    {return l;}

    public Serializable doIt() {
        String temp = l + Länge;
        if(temp.isEmpty())
        {
            temp = "";
        }
        return temp;

    }
}
