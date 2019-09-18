public class Car {
    private int numberOfWheels;
    private String color;
    private double price;

    private int getNumberOfWheels() {
        return numberOfWheels;
    }

    private void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    private String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    private double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private Car(int numberOfWheels, String color, double price) {
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        this.price = price;
    }

    /**
     * Complete the code
     * */

    public static void main(String[] args) {
        Car renault = new Car(4,"Red",13.567);

        // Our Peugeot has 4 wheels, a green color and a price of 17.995$
        Car peugeot = new Car();

        System.out.println("The cost of the Peugeot is " + peugeot.getPrice() + " $");
    }
}
