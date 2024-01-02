package comparator;

public enum Color {

  RED ("Red"),
  ORANGE ("Orange"),
  YELLOW ("Yellow"),
  GREEN ("Green"),
  BLUE ("Blue"),
  INDIGO ("Indigo"),
  VIOLET ("Violet"),
  WHITE ("White"),
  BLACK ("Black"),
  ;

  private String description;

  private Color(String description) {
    this.description = description;
  }

  public String getColorDescription() {
    return this.description;
  }
  
}
