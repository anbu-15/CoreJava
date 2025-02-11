import java.util.Scanner;

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class VotingEligibility {
    // Method to check age
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
//            throw new Exception("exception");
            throw new InvalidAgeException("You are not eligible to vote. Minimum age is 18.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Take user input
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Validate age
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid number. "+e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
