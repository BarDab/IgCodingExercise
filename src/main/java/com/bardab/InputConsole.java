import java.util.Scanner;

public class InputConsole {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = menu();
        while(choice!=0) {

            if (choice==1) {
                System.out.println("Credit Card Number Validator, please enter credit card number to validate and press enter");

                if (new CreditCardNumberValidator().validateCreditCardNumberUsingLuhnChecksum(scanner.next() + "")) {
                    System.out.println("Credit card number is valid");

                }
                else
                    System.out.println("Credit card number is not valid");
                    choice = menu();

            }
            else if (choice==2) {
                System.out.println("Palindrome generator, please enter the number to start from and press enter");
                PalindromeGenerator palindromeGenerator = new PalindromeGenerator().arriveAtPalindrome(scanner.next());
                System.out.println("Palindrome of value "+palindromeGenerator.getPalindrome()+" generated after " +palindromeGenerator.getIterations()+" iteration");

                choice = menu();
            }
            else if (choice==0) {
                System.exit(1);
            }
        }
    }

    public static int menu() {

        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Choose from these choices and press enter");
        System.out.println("-------------------------\n");
        System.out.println("1 - to choose Credit Card Number Validator");
        System.out.println("2 - to choose Palindrome Generator");
        System.out.println("0 - Quit");

        selection = input.nextInt();
        return selection;
    }



}
