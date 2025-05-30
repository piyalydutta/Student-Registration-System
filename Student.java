import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String name;
    private final Account account;
    private final List<Course> registeredCourses;

    public Student(String name, Account account) {
        this.name = name;
        this.account = account;
        this.registeredCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public void registerCourse(Course course) {
        if (!registeredCourses.contains(course)) {
            registeredCourses.add(course);
            System.out.println("Registered for course: " + course.getCourseName());
        } else {
            System.out.println("Already registered for this course.");
        }
    }

    public void displayRegisteredCourses() {
        System.out.println("Courses registered by " + name + ":");
        if (registeredCourses.isEmpty()) {
            System.out.println("No courses registered.");
        } else {
            for (Course course : registeredCourses) {
                System.out.println("- " + course.getCourseName());
            }
        }
    }
}
