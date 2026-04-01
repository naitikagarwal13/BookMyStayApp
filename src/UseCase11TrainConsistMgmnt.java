import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * MAIN CLASS - UseCase11TrainConsistMgmnt
 *
 * Use Case 11: Validate Train ID and Cargo Code
 *
 */

public class UseCase11TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC11 - Validate Train ID and Cargo Code");
        System.out.println("======================================\n");

        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // ---- DEFINE REGEX RULES ----
        String trainIdRegex = "TRN-\\d{4}";
        String cargoCodeRegex = "[A-Z]{3}-[A-Z]{2}";

        // Apply validation
        boolean isTrainIdValid = Pattern.matches(trainIdRegex, trainId);
        boolean isCargoCodeValid = Pattern.matches(cargoCodeRegex, cargoCode);

        // Display results
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + isTrainIdValid);
        System.out.println("Cargo Code Valid: " + isCargoCodeValid);

        System.out.println("\nUC11 validation completed ...");

        scanner.close();
    }
}