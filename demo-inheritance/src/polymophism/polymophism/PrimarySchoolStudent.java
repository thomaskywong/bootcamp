package polymophism;

public class PrimarySchoolStudent extends Student{

  public PrimarySchoolStudent(String name) {
    super(name);
  }

  @Override
  public String doHomework() {
    return "\nName: " + this.getName() 
           + "\nPrimary school student homework: 500 words essay";
  }

  @Override
  public String toString() {
    return "\nPrimary School Student."
           + "\nStudent Id: " + this.getStudentId()
           + "\nStudent Name: " + this.getName(); 
  }

  public void lunchInClassroom() {
    System.out.println("Having lunch in classroom.");
  }


}
