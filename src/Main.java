import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        double itemPrice = 0;
        double shippingPrice = 0;
        double totalPrice = 0;
        String badInput = "";
        Scanner in = new Scanner(System.in);

        System.out.println("What is the cost of the item? ");
        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine();

            if (itemPrice >= 100) {
                shippingPrice = 0;  // 0 is the default but it is safer to reassign 0
                System.out.println("Input is greater than or equal to 100");
            }
            else {
                shippingPrice = itemPrice * 0.02;
                System.out.println("Input is less than 100");
            }
            totalPrice = itemPrice + shippingPrice;
            System.out.println("The cost of shipping is " + shippingPrice + " and the total price is " + totalPrice);
        }
        else {
            badInput = in.nextLine();
            System.out.println(badInput + " is an invalid input.");
        }
        */


        /*
        int birthMonth = 0;
        String badInput = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your birth month date number: ");
        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine();

            if (birthMonth > 0 && birthMonth < 13) {
                System.out.println("Your birth month is: " + birthMonth);
            }
            else {
                System.out.println(birthMonth + " is out of the valid range.");
            }
        }
        else {
            badInput = in.nextLine();
            System.out.println(badInput + " is an invalid input.");
        }
        */

        /*
        String menuChoice = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Choose a menu item (C, F, V) ");
        menuChoice = in.nextLine();

        if (menuChoice.equals("C")) {
            System.out.println("You get the Teriyaki Chicken.");
        }
        else if (menuChoice.equals("F")) {
            System.out.println("You get the Seared Tuna Sushi.");
        }
        else if (menuChoice.equals("V")) {
            System.out.println("You get the Butternut Squash.");
        }
        else {
            System.out.println(menuChoice + " is an invalid input.");
        }
        */


        int age = 0;
        String badInput = "";
        Scanner in = new Scanner(System.in);

        System.out.println("What is your age in years? ");
        if (in.hasNextInt()) {
            age = in.nextInt();
            in.nextLine();

            if (age >= 21) {
                System.out.println("Here is your wristband.");
            }
        }
        else {
            badInput = in.nextLine();
            System.out.println(badInput + " is an invalid input.");
        }
    }
}