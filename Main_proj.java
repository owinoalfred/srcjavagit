import java.util.Scanner;

public class Main_proj {

    // public static void main(String[] args){
    /**
     * String Name = "alfred Owino";
     * String course = "Computer Science";
     * int rollNumber = 012221536;
     * System.out.println("Name: "+ Name);
     * System.out.println("Course: "+ course);
     * System.out.println("Sem: 2");
     * System.out.println("Roll Number: "+ rollNumber);
     */

    public static void main(String[] args) throws InterruptedException {
        int delay = 100; // milliseconds

        String greeting = "Welcome to this online Banking System\n";

        for (int i = 0; i < greeting.length(); i++) {
            System.out.print(greeting.charAt(i));
            Thread.sleep(delay);
        }

        String question_one = "what is your name please\n";
        for (int i = 0; i < question_one.length(); i++) {
            System.out.print(question_one.charAt(i));
            Thread.sleep(delay);
        }
        Scanner name_of_user = new Scanner(System.in);
        String name = name_of_user.nextLine();

        System.out.print("Hello Mr. ");
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            Thread.sleep(delay);
        }

    }
    // Closing brace for main method

}
