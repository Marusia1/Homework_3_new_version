public class CarDescription {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Hyundai";
        myCar.model = "Santa Fe";
        myCar.year = 2007;

        System.out.println("Car brand is: " + myCar.brand);
        System.out.println("Car model is: " + myCar.model);
        System.out.println("Car year is: " + myCar.year);

        myCar.startEngine();
        myCar.stopEngine();



    }
}
