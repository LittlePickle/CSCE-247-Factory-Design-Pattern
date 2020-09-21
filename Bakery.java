
public class Bakery {

    /**
     * Based on the String it will return the correct cake.
     *
     * @param type
     * @return the correct cake.
     */
    public Cake orderCake(String type) {
        Cake cake = createCake(type);
        // Then once it has the cake, it calls the cake's createCake method
        cake.createCake();
        // displays the price of the cake
        System.out.println("Price: $" + cake.getPrice());
        return cake;
    }

    /**
     * Based on the String it will return the correct cake
     * @param type
     * @return 
     */
    private Cake createCake(String type) {
        Cake cake;
        switch (type) {
            case "carrot cake":
                cake = new CarrotCake();
                break;
            case "black forest cake":
                cake = new BlackForestCake();
                break;
            case "birthday cake":
                cake = new BirthdayCake();
                break;
            default:
                cake = null;
                break;
        }
        return cake;
    }
}
