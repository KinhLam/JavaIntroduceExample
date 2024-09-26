package Lab.OOP.Days.Ex_2_EmployeeManagement;

public class MaketingEmployee extends Employee {
    private String level;

    public MaketingEmployee(String name, int id, double salary, String level) {
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
        System.out.println("Assigning Marketing Task");
    }

    public void createCampaign(){
        System.out.println("Creating a marketing compaign as a " + level + " maketing employee");
    }
}
