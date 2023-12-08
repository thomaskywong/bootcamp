public class Main {

  public static void main(String[] args) {

    // test Employee class methods
    Employee thomas = new Employee("Thomas", 10000);
    System.out.println(thomas.toString());
    thomas.onDuty();
    System.out.println(thomas.toString());
    thomas.offDuty();
    System.out.println(thomas.toString());
    thomas.setSalary(12000);
    System.out.println(thomas.toString());
    System.out.println();

    System.out.println(thomas.getName());
    System.out.println(thomas.getEmployeeId());
    System.out.println(thomas.getBasicSalary());
    
    thomas.setSalary(20000);
    System.out.println(thomas.toString());


    Employee yan = new Employee("Yan", 13000);
    yan.onDuty();
    System.out.println(yan.toString());

    Employee John = new Employee();
    System.out.println(John.toString());
    John.addDetail("John", 8000);
    System.out.println(John.toString());
    John.onDuty();
    System.out.println(John.toString());

    // test Office class methods
    Office mainOffice = new Office("Hong Kong");
    System.out.println(mainOffice.toString());

    mainOffice.addEmployee(thomas);
    System.out.println(mainOffice.toString());
    mainOffice.addEmployee(yan);
    mainOffice.addEmployee(John);
    System.out.println(mainOffice.toString());

    mainOffice.removeEmployee(2);
    System.out.println(mainOffice.toString());

    mainOffice.removeEmployee(1);
    System.out.println(mainOffice.toString());

    mainOffice.removeEmployee(3);
    System.out.println(mainOffice.toString());

    
  }
}
