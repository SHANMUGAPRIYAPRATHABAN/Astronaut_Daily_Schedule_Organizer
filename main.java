import java.util.Scanner;

public class AstronautScheduleOrganizer {
    public static void main(String[] args) {
        ScheduleManager scheduleManager = ScheduleManager.getInstance();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. View tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add task logic
                    break;
                case 2:
                    // Remove task logic
                    break;
                case 3:
                    // View tasks logic
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);

        scanner.close();
    }
}
