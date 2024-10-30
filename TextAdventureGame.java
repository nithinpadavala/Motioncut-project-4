import java.util.Scanner;

public class TextAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You find yourself in a mysterious forest. You have two paths ahead.");
        playGame(scanner);
        scanner.close();
    }
    public static void playGame(Scanner scanner) {
        System.out.println("Choose your path: ");
        System.out.println("1. Follow the narrow trail.");
        System.out.println("2. Enter the dark cave.");
        int choice = getUserChoice(scanner, 1, 2);
        if (choice == 1) {
            System.out.println("You follow the narrow trail and discover a hidden treasure chest!");
            System.out.println("Do you want to open it?");
            System.out.println("1. Open the chest.");
            System.out.println("2. Leave the chest alone.");
            choice = getUserChoice(scanner, 1, 2);
            if (choice == 1) {
                System.out.println("Congratulations! You found a magical artifact and gained special powers!");
            } else {
                System.out.println("You decide to leave the chest alone. The adventure continues...");
            }
        } else {
            System.out.println("You enter the dark cave and encounter a fierce dragon!");
            System.out.println("What do you want to do?");
            System.out.println("1. Fight the dragon.");
            System.out.println("2. Try to sneak past the dragon.");
            choice = getUserChoice(scanner, 1, 2);
            if (choice == 1) {
                System.out.println("You engage in a fierce battle with the dragon. Unfortunately, you are defeated.");
                System.out.println("Game Over!");
            } else {
                System.out.println("You successfully sneak past the dragon and find a hidden exit.");
                System.out.println("Congratulations! You have escaped the cave.");
            }
        }
        System.out.println("Thanks for playing the Text Adventure Game!");
    }
    public static int getUserChoice(Scanner scanner, int min, int max) {
        int choice = 0;
        boolean isValidInput = false;

        do {
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= min && choice <= max) {
                    isValidInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        } while (!isValidInput);
        return choice;
    }
}
