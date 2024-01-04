public class SetLunch {

  Food food;
  Drink drink;

  private SetLunch(Builder builder) {
    this.food = builder.food;
    this.drink = builder.drink;
  }

  public static Builder builder() {
    return new Builder();
  }

  public Food getFood() {
    return this.food;
  }

  public Drink getDrink() {
    return this.drink;
  }

  @Override
  public String toString() {
    return "food=" + this.food + ", drink=" + this.drink;
  }

  // Builder class
  public static class Builder {

    private Food food;
    private Drink drink;

    public Builder food(Food food) {
      this.food = food;
      return this;
    }

    public Builder drink(Drink drink) {
      this.drink = drink;
      return this;
    }

    public SetLunch build() {
      return new SetLunch(this);
    }

  }
  
}
