package Lab.OOP.Days.Ex_2_EmployeeManagement;

public class ITEmployee extends Employee{
    private String level;

    public ITEmployee(String name, int id, double salary, String level) {
        super(name, id, salary);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public void assignTask(){
        System.out.println("Assigning IT Task.");
    }

    public void debugCode(){
        System.out.println("Debugging code as a " + level + " IT employee");
    }
}
