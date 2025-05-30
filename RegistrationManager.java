import java.util.ArrayList;
import java.util.List;

public class RegistrationManager {
    private final List<Course> availableCourses;

    public RegistrationManager() {
        availableCourses = new ArrayList<>();
        loadCourses();
    }

    private void loadCourses() {
        availableCourses.add(new Course("CS101", "Introduction to Computer Science", 4));
        availableCourses.add(new Course("MA101", "Calculus I", 3));
        availableCourses.add(new Course("PH101", "Physics I", 3));
        availableCourses.add(new Course("EN101", "English Composition", 2));
    }

    public List<Course> getAvailableCourses() {
        return availableCourses;
    }

    public Course findCourseByCode(String code) {
        for (Course course : availableCourses) {
            if (course.getCourseCode().equalsIgnoreCase(code)) {
                return course;
            }
        }
        return null;
    }

    public void displayCourses() {
        System.out.println("Available Courses:");
        for (Course course : availableCourses) {
            System.out.println(course.getCourseCode() + " - " + course.getCourseName() +
                               " (" + course.getCredits() + " credits)");
        }
    }
}
