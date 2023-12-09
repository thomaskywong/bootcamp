public class Employee {

    private int employeeId;
    private String name;
    private double basicSalary;
    private static int employeeIdCounter = 0;

    public Employee() {
        this.employeeId = ++employeeIdCounter;
    }

    public Employee(String name, double basicSalary) {
        this.employeeId = ++employeeIdCounter;
        this.name = name;
        this.basicSalary = basicSalary;
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



    public void addDetail(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public void setSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "\nEmployee ID: " + this.employeeId + "\nEmployee name: "
                + this.name + "\nBasic salary: " + this.basicSalary
                + "\n";
    }
}
