import java.util.Scanner;

public class MarksEntry {
    private int[] marks = new int[5];
    private String[] names = new String[5];
    // Method to calculate marks and percentage
    public void calculateMarks() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter 5 integer marks:");
        for (int i = 0; i < 5; i++) {
            while (true) {
                try {
                    System.out.print("Mark " + (i + 1) + ": ");
                    marks[i] = Integer.parseInt(scanner.nextLine());
                    sum += marks[i];
                    break; // Exit the loop if input is valid
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter an integer value.");
                }
            }
        }
        double percentage = (sum / 5.0);
        System.out.println("Total Marks: " + sum);
        System.out.println("Percentage: " + percentage + "%");
    }
    // Method to store names and retrieve by index
    public void storeNames() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 names:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        while (true) {
            try {
                System.out.print("Enter an index (0-4) to retrieve the name: ");
                int index = Integer.parseInt(scanner.nextLine());
                System.out.println("Name at index " + index + ": " + names[index]);
                break; // Exit the loop if input is valid
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer value.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index out of bounds. Please enter a valid index (0-4).");
            }
        }
    }
    // Main method
    public static void main(String[] args) {
        MarksEntry marksEntry = new MarksEntry();
        marksEntry.calculateMarks();
        marksEntry.storeNames();
    }
}
