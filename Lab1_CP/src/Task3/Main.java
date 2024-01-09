package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BurrowsWheelerController burrowsWheelerController = new
                BurrowsWheelerController();
        System.out.println("Welcome to Burrows Wheeler encryption tool!");
        Scanner scanner = new Scanner(System.in);
        label:
        while (true) {
            System.out.println("Enter an option:");
            System.out.println("1. Encode text");
            System.out.println("2. Decode text");
            System.out.println("3. Exit");
            String answer = scanner.nextLine();
            switch (answer) {
                case "1": {
                    System.out.println("Enter phrase you want to encode");
                    System.out.println("Note: text must not contain $ sign");
                    String text = scanner.nextLine();
                    System.out.println(burrowsWheelerController.encode(text));
                    break;
                }
                case "2": {
                    System.out.println("Enter phrase you want to decode");
                    System.out.println("Note: text must contain exactly one $ sign");
                            String text = scanner.nextLine();
                    System.out.println(burrowsWheelerController.decode(text));
                    break;
                }
                case "3":
                    break label;
                default:
                    System.out.println("Wrong option!");
                    System.out.println("Returning to the main menu...");
                    break;
            }
        }
    }
}
