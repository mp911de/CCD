package de.paluch.ccd.fcoi.good;


/**
 * <br>
 * <br>
 * Project: CCD <br>
 * Autor: mark <br>
 * Created: 16.06.2012 <br>
 * <br>
 */
public class Cat extends AbstractAnimal {

    private final Leg[] legs = new Leg[4];
    private final Tail tail = new Tail();

    /**
     * @return the legs
     */
    public Leg[] getLegs() {
        return legs;
    }

    /**
     * @return the tail
     */
    public Tail getTail() {
        return tail;
    }

}
