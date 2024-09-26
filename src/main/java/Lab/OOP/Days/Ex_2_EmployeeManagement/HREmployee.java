package Lab.OOP.Days.Ex_2_EmployeeManagement;

public class HREmployee extends Employee{
    private int yearsOfExperience;

    public HREmployee(String name, int id, double salary, int yearsOfExperience) {
        super(name, id, salary);
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void assignTask(){
        System.out.println("Assigning HR Task.");
    }

    public void conductInterview(){
        System.out.println("Conducting an interview with " + yearsOfExperience + " years of experience.");
    }
}
