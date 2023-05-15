import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        ToyStore toyStore = new ToyStore();
        toyStore.addToy(new Toy(1, "Robot", 5, 20));
        toyStore.addToy(new Toy(2, "Construction Set", 10, 40));
        toyStore.addToy(new Toy(3, "Board Games", 8, 40));
        toyStore.addToy(new Toy(4, "Soft Toys", 15, 30));
        toyStore.addToy(new Toy(5, "Dolls", 12, 20));
        toyStore.addToy(new Toy(6, "Cars", 20, 10));

        // Update the weight of the "Board Games" toy
//        toyStore.updateToyWeight(3, 50);
//        // Choose a random toy and write it to a file
//        Toy winningToy = toyStore.chooseToy();
//        if (winningToy != null) {
//            try {
//                ToyStore.writeWinningToyToFile(winningToy, "winners.txt");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }

        Scanner scanner = new Scanner(System.in);
        String choice;
        // Main menu loop
        do {
            System.out.println("Welcome to the Toy Store!");
            System.out.println("Choose an option:");
            System.out.println("1. Add a toy");
            System.out.println("2. Update toy weight");
            System.out.println("3. Hold a raffle toys");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");

            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter toy ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter toy name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter toy quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter toy weight: ");
                    double weight = scanner.nextDouble();
                    scanner.nextLine();
                    toyStore.addToy(new Toy(id, name, quantity, weight));
                    System.out.println("Toy added successfully!");
                    break;
                case "2":
                    System.out.print("Enter toy ID: ");
                    int toyId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new weight: ");
                    double newWeight = scanner.nextDouble();
                    scanner.nextLine();
                    toyStore.updateToyWeight(toyId, newWeight);
                    System.out.println("Toy weight updated successfully!");
                    break;
                case "3":
                    Toy winningToy = toyStore.chooseToy();
                    if (winningToy != null) {
                        try {
                            toyStore.writeWinningToyToFile(winningToy, "winners.txt");
                            System.out.println("Congratulations! You won a " + winningToy.getName() + "!");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("Sorry, no toys available for winning.");
                    }
                    break;
                case "4":
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!choice.equals("4"));

        scanner.close();
    }

}
