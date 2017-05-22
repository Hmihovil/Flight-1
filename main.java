/**
 * Created by jienseock on 2017-02-10.
 */


import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        d flightA = new d();
        System.out.println("Flight number");
        flightA.setNumber(keyboard.next());
        System.out.println("Origin");
        flightA.setOrigin(keyboard.next());
        System.out.println("Destination");
        flightA.setDestination(keyboard.next());

        d flightB = new d();
        System.out.println("Flight number");
        flightB.setNumber(keyboard.next());
        System.out.println("Origin");
        flightB.setOrigin(keyboard.next());
        System.out.println("Destination");
        flightB.setDestination(keyboard.next());

        d flightC = new d();
        System.out.println("Flight number");
        flightC.setNumber(keyboard.next());
        System.out.println("Origin");
        flightC.setOrigin(keyboard.next());
        System.out.println("Destination");
        flightC.setDestination(keyboard.next());

        System.out.println(flightA.getNumber() + "   " + flightA.getOrigin() + "   " + flightA.getDestination());
        System.out.println(flightB.getNumber() + "   " + flightB.getOrigin() + "   " + flightB.getDestination());
        System.out.println(flightC.getNumber()+  "   "+  flightC.getOrigin() + "   " + flightC.getDestination());


    }
}
