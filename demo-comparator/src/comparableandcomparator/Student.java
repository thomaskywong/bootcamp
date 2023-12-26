package comparableandcomparator;

public class Student implements Comparable<Student>{

  private String name;
  private int score;

  public Student (int score , String name){
    this.score = score;
    this.name=name;
  }

  public int getScore(){
    return this.score;
  }
  
  public String getName(){
    return this.name;
  }
  // 
  // students.add(new Student(40, "Peter"));
  // students.add(new Student(30, "John"));
  // students.add(new Student(100, "Mary"));
  // students.add(new Student(20, "John"));
  // John 30 -> John 20 -> Mary 100 -> Peter 40

  @Override
  public int compareTo(Student student) {
    if(student.getName().compareTo(this.name) > 0) { // student.name > this.name
      return -1;
    } else if (student.getName().compareTo(this.name) == 0) {
       if (student.getScore() > this.score) {
        return 1; // larger come first
       } else {
        return -1;
       }
    } 
    return 1;
    //return student.getScore() > this.score ? -1 : 1;
  }

  @Override
  public String toString(){
    return "\nStudent( "
           + "name = "
           + this.name
           + ", score = "
           + this.score
           + ")";
  }

}
