import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");

        String mortgage = scan.nextLine();

        if (mortgage.equals("yes")) {

            System.out.println( "\nGreat! How much money do you have in your savings?" +
                    "\nAnd, how much do you owe in credit card debt?");

            double savings = scan.nextDouble();
            double creditCard = scan.nextDouble();

            System.out.println("\nHow many years have you worked for?");
            int years = scan.nextInt();

            scan.nextLine();
            System.out.println("\nWhat is your name?");
            String name = scan.nextLine();

            if (savings >= 10000 && creditCard < 5000 && years > 2) {
                System.out.println("\nCongratulations " + name + ", you have been approved!");
            } else {
                System.out.println("\nSorry " + name + ", you are not eligible for a mortgage.");
            }

        } else {
            System.out.println("\nOK. Have a nice day!");
        }

        scan.close();
    }
}
