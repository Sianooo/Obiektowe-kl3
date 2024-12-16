public class Car {
    String brand;
    int power;
    boolean sportDesign;


    /**
     * @param brand returns brand
     * @param power returns power
     * @param sportDesign returns sportDesign
     */
    public Car(String brand, int power, boolean sportDesign) {
        this.brand = brand;
        this.power = power;
        this.sportDesign = sportDesign;
    }

    /**
     * @param power returns power
     * @param brand returns brand
     */
    public Car(int power, String brand) {
        this.power = power;
        this.brand = brand;
    }

    /**
     * @param brand returns brand
     * @param sportDesign returns sportDesign
     */
    public Car(String brand, boolean sportDesign) {
        this.brand = brand;
        this.sportDesign = sportDesign;
    }

    /**
     * @param power returns power
     * @param sportDesign returns sportDesign
     */
    public Car(int power, boolean sportDesign) {
        this.power = power;
        this.sportDesign = sportDesign;
    }

    /**
     * @param brand returns brand
     */
    public Car(String brand) {
        this.brand = brand;
    }

    /**
     * @param power returns power
     */
    public Car(int power) {
        this.power = power;
    }

    /**
     * @param sportDesign returns sportDesign
     */
    public Car(boolean sportDesign) {
        this.sportDesign = sportDesign;
    }
}
