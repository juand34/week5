package clasesAbstractas;

/**
 * clasesAbstractas.Motorbike class of the Java program.
 */

public class Motorbike extends Vehicle {

    /**
     * Creates a new motorbike
     *
     * @param c the motorbike color
     * @param l the state of the motorbike lights
     */
    public Motorbike(String c, boolean l) {
        super(c, l);
    }


    /**
     * Returns a String representation of the motorbike
     *
     * @return the String representation of the motorbike
     */
    public String toString() {
        String result = "This motorbike is " + color + ", lights are " + stateLights() + ".";
        return result;
    }

}