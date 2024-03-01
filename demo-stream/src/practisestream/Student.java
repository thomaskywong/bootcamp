import java.util.Objects;

public class Student {

  private int id;
  private String name;
  private Rank rank;


  private static int idCounter = 1000;

  public Student(String name, Rank rank) {
    Objects.requireNonNull(name);
    this.name = name;
    this.id = ++idCounter;
    this.rank = rank;
  }

  public int getId() {
    return this.id;
  }  
  
  public String getName() {
    return this.name;
  }

  public Rank getRank() {
    return this.rank;
  }

  public void setRank(Rank rank) {
    this.rank = rank;
  }
  
  @Override 
  public String toString() {
    return "name=" + this.name + ", id=" + this.id;
  }

}
