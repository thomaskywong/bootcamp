public class Employee {

    private int employeeId;
    private String name;
    private double basicSalary;
    private boolean isOnDuty;

    private static int employeeIdCounter = 0;

    public Employee() {
        this.employeeId = ++employeeIdCounter;
    }

    public Employee(String name, double basicSalary) {
        this.employeeId = ++employeeIdCounter;
        this.name = name;
        this.basicSalary = basicSalary;
        this.isOnDuty = false;
    }

    // getter
    public int getEmployeeId() {
        return this.employeeId;
    }

    public String getName() {
        return this.name;
    }

    public double getBasicSalary() {
        return this.basicSalary;
    }

    public boolean isOnDuty() {
        return this.isOnDuty;
    }


    public void addDetail(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public boolean onDuty() {
        return this.isOnDuty = true;
    }

    public boolean offDuty() {
        return this.isOnDuty = false;
    }

    public void setSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "\nEmployee ID: " + this.employeeId + "\nEmployee name: "
                + this.name + "\nBasic salary: " + this.basicSalary
                + "\nOn duty: " + this.isOnDuty + "\n";
    }
}
