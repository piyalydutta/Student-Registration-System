import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegistrationManager manager = new RegistrationManager();

        System.out.println("=== Student Registration System ===");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Create username: ");
        String username = scanner.nextLine();
        System.out.print("Create password: ");
        String password = scanner.nextLine();

        Account account = new Account(username, password);
        Student student = new Student(name, account);

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. View Available Courses");
            System.out.println("2. Register for a Course");
            System.out.println("3. View Registered Courses");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1 -> manager.displayCourses();
                case 2 -> {
                    System.out.print("Enter course code to register: ");
                    String code = scanner.nextLine();
                    Course course = manager.findCourseByCode(code);
                    if (course != null) {
                        student.registerCourse(course);
                    } else {
                        System.out.println("Course not found.");
                    }
                }
                case 3 -> student.displayRegisteredCourses();
                case 0 -> {
                    System.out.println("Exiting system. Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}
