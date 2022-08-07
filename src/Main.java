import java.util.Objects;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        greetings();

        System.out.println("""
                Function A: Carrier Conductivity Function: it basically computes the conductivity...(Press A to access it.)
                Function B: Total Surface Area of a Cylinder Function: it basically computes the Total Surface Area of a Cylinder...(Press B to access it.)\s
                Function C: Mobility of Electrons Function: it basically computes the Mobility of Electrons...(Press C to access it.)
                Function D provides you with the link to the Metlab Website""");


        String selectFunction = input.next();
        if (Objects.equals(selectFunction.toUpperCase(), "A")) {
            carrierCond();
            } else if (Objects.equals(selectFunction.toUpperCase(), "B")) {
                surfaceArea();
                } else if (Objects.equals(selectFunction.toUpperCase(), "C")) {
                    mobilityElectrons();
                    } else if (Objects.equals(selectFunction.toUpperCase(), "D")) {
                        System.out.println("Click on the link below to visit the Matlab Website ");

                        } else {
                            System.out.println("Variable not defined!");

        }


    }
    static void carrierCond() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ok! This is the Carrier Conductivity Function..." +
                "\n You'd have to provide the Charge, Concentration and the Mobility to compute the Carrier Conductivity... ");

        System.out.print("Charge= ");
        double q = input.nextDouble();

        System.out.print("Concentration= ");
        double n = input.nextDouble();

        System.out.print("Mobility= ");
        double u = input.nextDouble();

        double ans = q * n * u;
        System.out.println("The Carrier Conductivity is "+ ans);
    }

    static void surfaceArea() {
        Scanner input = new Scanner(System.in);


        System.out.println("Ok! This is the Total Surface Area of a Cylinder Function..." +
                "\n You'd have to provide the Radius and the Height of the cylinder to compute the Total Surface Area... ");

        System.out.print("Radius= ");
        double r = input.nextDouble();

        System.out.print("Height= ");
        double h = input.nextDouble();

        double ans = (2 * Math.PI * r * r) + (2 * Math.PI * r) * h;
        System.out.println("The Total Surface Area of the Cylinder is " + ans);
    }

    static void mobilityElectrons() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ok! This is the Mobility of Electrons Function..." +
                "\n You'd have to provide the Distance, Voltage and Time to compute the Mobility of the electron... ");

        System.out.print("Distance= ");
        double d = input.nextDouble();

        System.out.print("Voltage= ");
        double v = input.nextDouble();

        System.out.print("Time= ");
        double t = input.nextDouble();

        double ans = (d * d)/(v * t);
        System.out.println("The Mobility of the Electron is " + ans);


    }
    static void greetings() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your name here: ");
        String name = input.nextLine();
        System.out.println("Hi " + name +
                ",\n We have got 4 Functions here for you!");
    }
}