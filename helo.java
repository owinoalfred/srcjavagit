import java.util.Scanner;

public class helo {

    public static void main(String[] args) throws InterruptedException {

        String greeting = "Welcome to this online Banking System\n";
        printingStrings(greeting);
        /*
         * for (int i = 0; i < greeting.length(); i++) {
         * System.out.print(greeting.charAt(i));
         * Thread.sleep(50);
         * }
         */

        String question_one = "what is your name please: ";
        printingStrings(question_one);
        String name = new Scanner(System.in).nextLine();

        System.out.print("\nHello Mr. ");
        printingStrings(name);

        String question_two = "\nWhat can wed do for you today\n" +
                "Please chose from the list below\n" +
                "1. Check the account balance\n" +
                "2. Deposit Cash\n" +
                "3. Update information\n" +
                "4. logout ";

        printingStrings(question_two);

        int numberChosen = new Scanner(System.in).nextInt();

        switch (numberChosen) {
            case 1: {
                String case_one = "Thanks for checking your balance\n" +
                        "Please find the information below\n" +
                        "YOur Balance is $700,000\n" +
                        "Would you like to continue" +
                        "Please choose the option";
                int choiceNow = new Scanner(System.in).nextInt();
                if (choiceNow == 1) {

                }

                for (int i = 0; i < case_one.length(); i++) {
                    System.out.print(case_one.charAt(i));
                    if (i == case_one.length() - 1) {
                        System.out.println(" ");
                    }
                    Thread.sleep(50);
                }

                break;
            }
            case 2: {
                String case_one = "Thanks for wanting to deposit money in your account.";

                for (int i = 0; i < case_one.length(); i++) {
                    System.out.print(case_one.charAt(i));
                    if (i == case_one.length() - 1) {
                        System.out.println(" ");
                    }
                    Thread.sleep(50);
                }

                break;
            }

            default:
                break;
        }

    }

    public static String printingStrings(String word) throws InterruptedException {

        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i));
            if (i == word.length() - 1) {
                System.out.print(" ");
            }
            Thread.sleep(50);
        }

        return word;

    }
}
