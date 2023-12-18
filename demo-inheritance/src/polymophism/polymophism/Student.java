package polymophism;

public abstract class Student {

  private String name;
  private int studentId;

  private static Student[] students = new Student[0];
  private static int idCounter = 0;

  private static String[] homeworks = new String[0];

  public Student(String name) {
    this.name = name;
    this.studentId = ++Student.idCounter;
  }

  public abstract String doHomework();

  @Override
  public abstract String toString();

  public int getStudentId() {
    return this.studentId;
  }

  public String getName() {
    return this.name;
  }


  public static int getIdCounter() {
    return Student.idCounter;
  }

  // (static) public student record
  public static void addStudent(Student student) {
    Student [] newArr = new Student[Student.students.length + 1];
    for (int i = 0; i < Student.students.length; i++) {
      newArr[i] = students[i];
    }
    newArr[newArr.length - 1] = student;
    students = newArr;
  }

  public static void viewStudentRecords() {
    for (int i = 0; i < students.length; i++) {
      System.out.println(students[i].toString());
    }

  }
 
  // Turn in homework
  public void turnInHomework() {
    String homework = this.doHomework();    // call child's instance method by polymophism
    String[] newArr = new String[Student.homeworks.length + 1];
    for (int i = 0; i < Student.homeworks.length; i++) {
      newArr[i] = Student.homeworks[i];
    }
    newArr[newArr.length - 1] = homework;
    homeworks = newArr;
  }

  // View Homeworks record
  public static void viewHomeworks() {
    System.out.println("Total " + Student.homeworks.length + " homeworks found.");
    for (int i = 0; i < Student.homeworks.length; i++) {
      System.out.println("Homework " + (i+1) + ": " + Student.homeworks[i]);
    }
  }

}
