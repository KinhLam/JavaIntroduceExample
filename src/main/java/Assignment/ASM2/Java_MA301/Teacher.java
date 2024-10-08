package Assignment.ASM2.Java_MA301;

public class Teacher extends Person {
    double bassicSalary, subsidy;

    public Teacher(String fullName, String gender, String phoneNumber, String email, double bassicSalary, double subsidy) {
        super(fullName, gender, phoneNumber, email);
        this.bassicSalary = bassicSalary;
        this.subsidy = subsidy;
    }

    public Teacher(double bassicSalary, double subsidy) {
        this.bassicSalary = bassicSalary;
        this.subsidy = subsidy;
    }

    public Teacher(){}

    public double getBassicSalary() {
        return bassicSalary;
    }

    public void setBassicSalary(double bassicSalary) {
        this.bassicSalary = bassicSalary;
    }

    public double getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(double subsidy) {
        this.subsidy = subsidy;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subsidy=" + subsidy +
                ", bassicSalary=" + bassicSalary +
                '}';
    }

    @Override
    public void purchaseParkingPass(){
        System.out.println("Student parking pass purchased");
    }

    public double calculateSalary(){
        return bassicSalary + subsidy;
    }
}
