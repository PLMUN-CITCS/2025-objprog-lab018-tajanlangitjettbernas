import java.util.Scanner;

public class EvenOddChecker {

    // Method to get an integer input from the user
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                
                System.out.print("Please enter an integer: ");
                String userInput = scanner.nextLine();
               
                int number = Integer.parseInt(userInput);
               
                return number;
            } catch (NumberFormatException e) {
                
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    
    public static String checkEvenOrOdd(int number) {
  
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }

 
    public static void main(String[] args) {

        int number = getIntegerInput();
    
        String resultMessage = checkEvenOrOdd(number);
        
        System.out.println(resultMessage);
    }
}