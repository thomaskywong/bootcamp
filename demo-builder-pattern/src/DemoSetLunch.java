public class DemoSetLunch {
  public static void main(String[] args) {

    SetLunch.Builder builder = new SetLunch.Builder();
    builder.drink(Drink.HOT_COFFEE);
    System.out.println(builder);

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
