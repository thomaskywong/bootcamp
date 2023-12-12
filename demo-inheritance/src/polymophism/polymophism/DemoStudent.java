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

    s1.turnInHomework();
    s3.turnInHomework();
    Student.viewHomeworks();
    System.out.println();

    s2.turnInHomework();
    Student.viewHomeworks();

    System.out.println();
    PrimarySchoolStudent ps1 = (PrimarySchoolStudent) s1;
    ps1.lunchInClassroom();

    System.out.println();
    SecondarySchoolStudent ss1 = (SecondarySchoolStudent) s2;
    ss1.goOutForLunch();

  }

}
