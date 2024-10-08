package Assignment.ASM2.Java_MA301;

public class Student extends Person {
    String studentID;
    double theory, practice;

    public Student(String fullName, String gender, String phoneNumber, String email, String studentID, double theory, double practice) {
        super(fullName, gender, phoneNumber, email);
        this.studentID = studentID;
        this.theory = theory;
        this.practice = practice;
    }

    public Student(String studentID, double theory, double practice) {
        this.studentID = studentID;
        this.theory = theory;
        this.practice = practice;
    }

    public Student() {}

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public double getTheory() {
        return theory;
    }

    public void setTheory(double theory) {
        this.theory = theory;
    }

    public double getPractice() {
        return practice;
    }

    public void setPractice(double practice) {
        this.practice = practice;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", theory=" + theory +
                ", practice=" + practice +
                '}';
    }

    public double calculateFinalmark(){
        return (theory + practice) / 2;
    }

    @Override
    public void purchaseParkingPass(){
        System.out.println("Student parking pass purchased");
    }
}
