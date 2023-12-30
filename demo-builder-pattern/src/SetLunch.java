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

  public static void main(String[] args) {

    SetLunch lunch1 = SetLunch.builder().food(Food.BEEF_RICE)
        .drink(Drink.HOT_MILK_TEA).build();

    System.out.println(lunch1);
    System.out.println();

    SetLunch lunch2 = SetLunch.builder().food(Food.FILET_FISH_PASTA)
        .drink(Drink.ICE_COFFEE).build();

    System.out.println(lunch2);
    System.out.println();
  }

}
