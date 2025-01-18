import java.util.ArrayList;
import java.util.Scanner;

public class HauntedMansionGame {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> inventory = new ArrayList<>();
    static boolean hasKey = false;

    public static void main(String[] args) {
        System.out.println("Welcome to the Haunted Mansion!");
        System.out.println("Your goal is to find the treasure and escape alive.");
        System.out.println("Type your choices carefully. Let the game begin!");

        enterMainHall();
    }

    public static void enterMainHall() {
        System.out.println("\nYou are in the Main Hall. There are three doors:");
        System.out.println("1. Enter the Living Room");
        System.out.println("2. Enter the Kitchen");
        System.out.println("3. Go Upstairs");
        System.out.print("Choose a door (1/2/3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                enterLivingRoom();
                break;
            case 2:
                enterKitchen();
                break;
            case 3:
                goUpstairs();
                break;
            default:
                System.out.println("Invalid choice. Try again.");
                enterMainHall();
        }
    }

    public static void enterLivingRoom() {
        System.out.println("\nYou entered the Living Room. It's dark and eerie.");
        System.out.println("You see a creepy painting and a dusty bookshelf.");
        System.out.println("1. Inspect the painting");
        System.out.println("2. Check the bookshelf");
        System.out.println("3. Go back to the Main Hall");
        System.out.print("Choose an action (1/2/3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("The painting moves! You find a hidden key behind it.");
                inventory.add("Key");
                hasKey = true;
                enterLivingRoom();
                break;
            case 2:
                System.out.println("You find an old journal. It's too damaged to read.");
                enterLivingRoom();
                break;
            case 3:
                enterMainHall();
                break;
            default:
                System.out.println("Invalid choice. Try again.");
                enterLivingRoom();
        }
    }

    public static void enterKitchen() {
        System.out.println("\nYou entered the Kitchen. A ghost is guarding a chest!");
        if (hasKey) {
            System.out.println("1. Use the Key to open the chest");
        } else {
            System.out.println("1. You don’t have the key. Go back to the Main Hall");
        }
        System.out.println("2. Confront the ghost");
        System.out.print("Choose an action (1/2): ");
        int choice = scanner.nextInt();

        if (choice == 1 && hasKey) {
            System.out.println("You use the key to open the chest and find the treasure! You win!");
            playAgain();
        } else if (choice == 1) {
            enterMainHall();
        } else if (choice == 2) {
            System.out.println("The ghost attacks you. Game over!");
            playAgain();
        } else {
            System.out.println("Invalid choice. Try again.");
            enterKitchen();
        }
    }

    public static void goUpstairs() {
        System.out.println("\nYou go upstairs and find two rooms:");
        System.out.println("1. Enter the Bedroom");
        System.out.println("2. Enter the Study");
        System.out.print("Choose a room (1/2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("You find a spooky mirror. Nothing else here.");
            goUpstairs();
        } else if (choice == 2) {
            System.out.println("You find a glowing orb, but it’s cursed! You feel weak.");
            System.out.println("You collapse. Game over!");
            playAgain();
        } else {
            System.out.println("Invalid choice. Try again.");
            goUpstairs();
        }
    }

    public static void playAgain() {
        System.out.print("Would you like to play again? (yes/no): ");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("yes")) {
            inventory.clear();
            hasKey = false;
            enterMainHall();
        } else {
            System.out.println("Thanks for playing! Goodbye!");
            System.exit(0);
        }
    }
}
