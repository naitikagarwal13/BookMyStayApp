/**
 * MAIN CLASS - UseCase1TrainConsistMgmnt
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description:
 * This class represents the entry point of the Train Consist
 * Management Application.
 *
 * At this stage, the application:
 * - Creates an empty train consist
 * - Uses a dynamic List to store bogies
 * - Displays initial bogie count
 * - Prints the current state of the train
 *
 * @author Developer
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class UseCase1TrainConsistMgmnt {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("=== Train Consist Management App ===\n");

        // Create a dynamic list to store train bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initialization message
        System.out.println("Train initialized successfully ...");

        // Display initial bogie count
        System.out.println("Initial Bogie Count : " + trainConsist.size());

        // Display current train consist
        System.out.println("Current Train Consist : " + trainConsist);

        // System ready message
        System.out.println("\nSystem ready for operations ...");
    }
}