package polymophism;

public class SecondarySchoolStudent extends Student {

  public SecondarySchoolStudent(String name) {
    super(name);
  }

  @Override
  public String doHomework() {
    return "\nName: " + this.getName() 
           +"\nSecondary school student homework: 2000 words essay";
  }

  @Override
  public String toString() {
    return "\nSecondary School Student."
           + "\nStudent Id: " + this.getStudentId()
           + "\nStudent Name: " + this.getName(); 
  }

  public void goOutForLunch() {
    System.out.println("Going out for lunch.");
  }

}
