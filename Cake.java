
import java.util.ArrayList;

public abstract class Cake {

    protected String name;
    protected double price;
    protected int numLayers;
    protected ArrayList<String> decorations;
    protected Shape shape;
    protected String flavor;
    protected String icing;

    public Cake() {
        // create the ArrayList for the decorations
        decorations = new ArrayList<String>();
    }

    public void createCake() {
        // calls: createLayers, frostCake, and addDecorations
        createLayers();
        frostCake();
        addDecorations();
    }

    /**
     * display a message depending on the number of layers and other cake
     * information
     */
    private void createLayers() {
        String disp = "";
        if (numLayers == 1) {
            // 1 layer round or sheet cake: "Creating a 1 layer shape flavor cake"
            disp = String.format("Creating a 1 layer %s %s cake", shape.toString().toLowerCase(), flavor);
        } else {
            // Multiple layer round or sheet cake: "Creating a noLayers layered shape flavor cake"
            disp = String.format("Creating a %d layered %s %s cake", numLayers, shape.toString().toLowerCase(), flavor);
        }
        System.out.println(disp);
    }

    /**
     * Loops through the ArrayList of decorations
     */
    private void frostCake() {
        System.out.println("Frost cake with " + icing + " icing ");
    }

    /**
     * Loops through the ArrayList of decorations, display the info
     */
    private void addDecorations() {
        for (String dec : this.decorations) {
            System.out.println("Adding " + dec + ".");
        }

    }

    /**
     * returns the price of the cake
     *
     * @return
     */
    public double getPrice() {
        return price;
    }

}
