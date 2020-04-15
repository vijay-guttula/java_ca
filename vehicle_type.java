
public abstract class vehicle_type implements cars_bikes {

    vehicle_type() {
        System.out.println("Super class constructor Invoked");
    }

    vehicle_type(int n) {

        System.out.println("\n\nName        Vehicle_type        Vehicle_Model");
    }

    vehicle_type(String s) {
        System.out.println("Enter the name, Vehicle_type and the Vehicle_model of the customer");
    }

    public String cars() {
        return "\nProgram about to quit";

    }

    public String bikes() {

        return "Program exited\n";

    }

}