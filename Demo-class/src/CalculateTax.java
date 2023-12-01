import java.text.NumberFormat;

public class CalculateTax {

  public static void main(String[] args) {
    TaxCalculator calculator1 = new TaxCalculator();

    NumberFormat percent = NumberFormat.getPercentInstance();
    NumberFormat currency = NumberFormat.getCurrencyInstance();

    double income = 3000;
    System.out.println("Income = " + currency.format(income));
    System.out.println("Tax rate = " + percent.format(calculator1.getTaxRate()));
    System.out.println("Tax amount = " + currency.format(calculator1.calculateTax(income)));

    income = 1000;
    System.out.println("Income = " + currency.format(income));
    System.out.println("Tax rate = " + percent.format(calculator1.getTaxRate()));
    System.out.println("Tax amount = " + currency.format(calculator1.calculateTax(income)));

    calculator1.setTaxRate(0.5);
    income = 1000;
    System.out.println("Income = " + currency.format(income));
    System.out.println("Tax rate = " + percent.format(calculator1.getTaxRate()));
    System.out.println("Tax amount = " + currency.format(calculator1.calculateTax(income)));



  }
  
}
