public class UseCase20TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("UC20 - Exception Handling During Search\n");

        // Create bogie array (empty train scenario)
        String[] bogieIds = {};

        // Search key
        String searchId = "BG101";

        // ---- FAIL-FAST VALIDATION ----
        if (bogieIds.length == 0) {
            throw new IllegalStateException(
                "No bogies available in train. Cannot perform search."
            );
        }

        // ---- SEARCH LOGIC (executes only if data exists) ----
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equalsIgnoreCase(searchId)) {
                found = true;
                break;
            }
        }

        // Display result
        if (found) {
            System.out.println("Bogie " + searchId + " found.");
        } else {
            System.out.println("Bogie " + searchId + " NOT found.");
        }

        System.out.println("\nUC20 execution completed...");
    }
}