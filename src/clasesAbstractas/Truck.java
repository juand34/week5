package clasesAbstractas;

/**
 * clasesAbstractas.Truck class of the Java program.
 */

public class Truck extends Vehicle {

    /**
     * Number of trailers
     */
    int trailers;

    /**
     * Creates a new truck
     *
     * @param c the truck color
     * @param l the state of the truck lights
     */
    public Truck(String c, boolean l) {
        super(c, l);
        trailers = 0;
    }

    /**
     * Creates a new truck
     *
     * @param c the truck color
     * @param l the state of the car lights
     * @param t the number of trailers
     */
    public Truck(String c, boolean l, int t) {
        super(c, l);
        trailers = t;
    }

    /**
     * Returns a String representation of the truck
     *
     * @return the String representation of the truck
     */
    public String toString() {
        String result1 = "This truck is " + color + ", lights are " + stateLights();
        String result2 = " and carries " + trailers + " trailers.";
        return result1 + result2;
    }

    /**
     * Gets the number of trailers
     *
     * @return  the number of trailers of the truck
     */
    public int getTrailers(){
        return trailers;
    }

    /**
     * Sets the number of trailers color
     *
     * @param t  the number of trailers
     */
    public void setTrailers(int t){
        trailers = t;
    }

}