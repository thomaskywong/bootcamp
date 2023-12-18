package polymophism;

public class DemoStudent {

  public static void main(String[] args) {
    
    Student s1 = new PrimarySchoolStudent("Constant");
    Student s2 = new SecondarySchoolStudent("Thomas");

    Student.addStudent(s1);
    Student.addStudent(s2);

    Student.viewStudentRecords();

    System.out.println();
    System.out.println("New student added");

    Student s3 = new SecondarySchoolStudent("Yan");
    Student.addStudent(s3);
    Student.viewStudentRecords();
    System.out.println();

    s1.turnInHomework();    // inherited method from parent class
    s3.turnInHomework();    // inherited method from parent class
    Student.viewHomeworks();    // static method in parent class
    System.out.println();

    s2.turnInHomework();
    Student.viewHomeworks();

    System.out.println();
    PrimarySchoolStudent ps1 = (PrimarySchoolStudent) s1;
    ps1.lunchInClassroom(); // child class instance method can only be called by obj with the same class type reference
    //s2.lunchInClassroom();  // parent class reference cannot call child class instance method. compilation error

    System.out.println();
    SecondarySchoolStudent ss1 = (SecondarySchoolStudent) s2;
    ss1.goOutForLunch();
    // s2.goOutForLunch();  // parent class reference cannot call instance method of child class. Compilation error

    PrimarySchoolStudent ps2 = new PrimarySchoolStudent("Jerry");
    SecondarySchoolStudent ss2 = new SecondarySchoolStudent("Tommy");
    Student.addStudent(ps2);
    Student.addStudent(ss2);
    Student.viewStudentRecords();


  }

}
