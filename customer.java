
import java.io.*;
import java.util.*;

public class customer extends vehicle_type {
    customer() {
        super(); // calls super class constructor
    }

    customer(int n) {
        super(n); // calls super class constructor
    }

    customer(String s) {
        super(s); // calls super class constructor
    }

    public void customer_input() throws Exception {

        // File Input Stream implemented

        FileWriter f = new FileWriter("./files/garage.txt", true);
        PrintWriter output = new PrintWriter(f);
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        output.print(name + "\t\t");

        String vehicle_type_ = input.nextLine();
        output.print(vehicle_type_ + "\t\t");

        String vehicle_name = input.nextLine();
        output.print(vehicle_name + "\n");

        output.close();
        return;

    }

    public void customer_output() throws IOException {
        // File output Stream implemented

        File file = new File("./files/garage.txt");
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String s = input.nextLine();
            System.out.println(s);
        }
        input.close();
        return;
    }

    public static void main(String args[]) throws Exception {
        int n;
        customer c = new customer();
        Scanner input = new Scanner(System.in);

        System.out.println("----------------Welcome to Janatha Garage----------------");
        boolean check = true;
        while (check) {
            System.out.println("\n1.) Add New Record");
            System.out.println("\n2.) View Records\n\n");

            // Exception Implementation
            try {
                n = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nEnter an integer only\n");
                break;
            }

            if (n == 1) {
                c = new customer("1");
                c.customer_input();
                System.out.println("\n Press 1 to go back or any other to exit ");

                try {
                    n = input.nextInt();
                } catch (InputMismatchException e) {
                    // System.out.println("\nEnter an integer only\n");
                    break;
                }
                if (n == 1) {
                    check = true;
                } else {
                    check = false;
                }
            } else if (n == 2) {
                c = new customer(1);
                c.customer_output();
                System.out.println("\n Press 1 to go back or any other to exit ");
                try {
                    n = input.nextInt();
                } catch (InputMismatchException e) {
                    // System.out.println("\nEnter an integer only\n");
                    break;
                }
                if (n == 1) {
                    check = true;
                } else {
                    check = false;
                }
            }
        }

        System.out.println(c.cars());
        System.out.println(c.bikes());

    }

}