import java.nio.DoubleBuffer;
import java.util.Scanner;
//almost forgot the comments!!!
//joseph momot CSCI 1660
//1660? 1660 super!?!?
//very nice compliment for extra points



public class Main {
    public static void main(String[] args) {
        UserInput input = new UserInput();
        int aNumber = input.promptInt("Enter an integer.");
        System.out.println("Twice your number is " + aNumber * 2);
        double aNumber2 = input.promptDouble("Enter a Double.");
        System.out.println("twice your number is " + aNumber2* 2);
        String aNumber3 = input.promptString("Enter a string");
        System.out.println("Your string is " + aNumber3);


    }

}


class UserInput {
    Scanner scanner = new Scanner(System.in);

    public int promptInt(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        int userInt = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = Integer.parseInt(userInput);
                isInt = true;
            } catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid integer. " + message);
                userInput = scanner.nextLine();
            } finally {
                System.out.println("This line is always executed.");
            }
        }

        return userInt;
    }


    public double promptDouble(String message) {
        System.out.println(message);
        String userInput = scanner.nextLine();

        double userDouble = 0.0;
        boolean isDouble = false;
        while (!isDouble) {
            try {
                userDouble = Double.parseDouble(userInput);
                isDouble = true;
            } catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid Double. " + message);
                userInput = scanner.nextLine();
            } finally {
                System.out.println("This line is always executed.");
            }
        }

        return userDouble;
    }


        public String promptString(String message) {
            System.out.println(message);
            String userInput = scanner.nextLine();

            boolean isString = false;
            while (!isString) {
                try {
                    Double.parseDouble(userInput);
                    System.out.println("this is not a string");

                    userInput = scanner.nextLine();

                } catch (NumberFormatException e) {
                    isString = true;
                    System.out.println(userInput);
                }
            }
            return userInput;
        }
    }
