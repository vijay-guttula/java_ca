
import java.io.*;
import java.util.*;

public class customer extends vehicle_type {
    customer() {
        super();

    }

    public void customer_input() throws Exception {
        FileWriter f = new FileWriter("garage.txt", true);
        PrintWriter output = new PrintWriter(f);
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        output.print(name + " ");

        String vehicle_type_ = input.nextLine();
        output.print(vehicle_type_ + " ");

        String vehicle_name = input.nextLine();
        output.print(vehicle_name + "\n");

        output.close();

    }

    public void customer_output() throws IOException {
        System.out.println();

        File file = new File("garage.txt");
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String s = input.nextLine();
            System.out.println(s);
        }
        input.close();
    }

    public static void main(String args[]) throws Exception {

        customer c = new customer();
        c.customer_input();
        c.customer_output();

        System.out.println(c.cars());
        System.out.println(c.bikes());

    }

}