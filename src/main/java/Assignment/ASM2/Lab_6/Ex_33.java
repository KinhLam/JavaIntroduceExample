package Assignment.ASM2.Lab_6;

import java.util.LinkedList;

class CourseEnrollment {
    String courseName;
    String instructor;
    int studentCount;

    public CourseEnrollment(String courseName, String instructor, int studentCount) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.studentCount = studentCount;
    }

    @Override
    public String toString() {
        return "Course: " + courseName + ", Instructor: " + instructor + ", Students: " + studentCount;
    }
}

public class Ex_33 {
    LinkedList<CourseEnrollment> courses = new LinkedList<>();

    public void addCourse(CourseEnrollment course) {
        courses.add(course);
    }

    public void removeCourse(String courseName) {
        courses.removeIf(course -> course.courseName.equalsIgnoreCase(courseName));
    }

    public void displayCourses() {
        System.out.println("Available Courses:");
        for (CourseEnrollment course : courses) {
            System.out.println(course);
        }
    }

    public static void main(String[] args) {
        Ex_33 platform = new Ex_33();
        platform.addCourse(new CourseEnrollment("Java Programming", "John Smith", 100));
        platform.addCourse(new CourseEnrollment("Web Development", "Jane Doe", 75));

        platform.displayCourses();

        platform.removeCourse("Java Programming");
        System.out.println("After removing Java Programming course:");
        platform.displayCourses();
    }
}