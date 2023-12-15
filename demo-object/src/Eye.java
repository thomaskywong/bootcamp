import java.util.Objects;

public class Eye {

  private String eyeColor;

  public Eye(String eyeColor) {
    this.eyeColor = eyeColor;
  }

  public String getEyeColor() {
    return this.eyeColor;
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj) {
      return true;
    } 

    if (!(obj instanceof Eye)) {
      return false;
    }
    Eye eye = (Eye) obj;

    return Objects.equals(eye.getEyeColor(), this.eyeColor);
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.eyeColor);
  }
  
}
