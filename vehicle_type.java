
public abstract class vehicle_type implements cars_bikes {

    vehicle_type() {
        System.out.println("Super class constructor Invoked");
        System.out.println("Enter your Name, Vehicle type, Vehicle Model");
    }

    public String cars() {
        return "\nCars_bikes Interface, car method implemented";

    }

    public String bikes() {

        return "Cars_bikes Interface, bike method implemented \n";

    }

}