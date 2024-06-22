import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the Course Center Application!");

        Scanner scanner = new Scanner(System.in);
        CourseCenter courseCenter = new CourseCenter();

        boolean authenticated = false;

        while (!authenticated) {
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            User user = courseCenter.authenticateUser(username, password);

            if (user != null) {
                authenticated = true;
                System.out.println("Login successful!");

                if (user instanceof Instructor) {
                    courseCenter.displayStudents();
                } else if (user instanceof Student) {
                    courseCenter.displayCourses();
                }
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }
    }
}