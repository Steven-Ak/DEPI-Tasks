import java.util.List;
import java.util.ArrayList;
 class CourseCenter {
    private List<Instructor> instructors;
    private List<Student> students;
    private List<String> courses;

    public CourseCenter() {
        instructors = new ArrayList<>();
        students = new ArrayList<>();
        courses = new ArrayList<>();

        initializeData();
    }

    private void initializeData() {
        instructors.add(new Instructor("instructor1", "instPass1"));
        instructors.add(new Instructor("instructor2", "instPass2"));
        instructors.add(new Instructor("instructor3", "instPass3"));
        instructors.add(new Instructor("instructor4", "instPass4"));

        students.add(new Student("student1", "stuPass1"));
        students.add(new Student("student2", "stuPass2"));
        students.add(new Student("student3", "stuPass3"));
        students.add(new Student("student4", "stuPass4"));

        courses.add("Java Programming");
        courses.add("Web Development");
        courses.add("Data Science");
        courses.add("Machine Learning");
    }

    public User authenticateUser(String username, String password) {
        for (Instructor instructor : instructors) {
            if (instructor.authenticate(username, password)) {
                return instructor;
            }
        }
        for (Student student : students) {
            if (student.authenticate(username, password)) {
                return student;
            }
        }
        return null;
    }

    public void displayStudents() {
        System.out.println("List of Students: ");
        for (Student student : students) {
            System.out.println("- " + student.getUsername());
        }
    }

    public void displayCourses() {
        System.out.println("List of Courses: ");
        for (String course : courses) {
            System.out.println("- " + course);
        }
    }
}
