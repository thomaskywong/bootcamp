public class TaxCalculator {

  private double taxRate;
  
  public TaxCalculator() {
    this.taxRate = 0.1d;
  }

  public TaxCalculator(double taxRate) {
    this.taxRate = taxRate;
  }

  public void setTaxRate(double taxRate) {
    this.taxRate = taxRate;
  }

  public double getTaxRate() {
    return this.taxRate;
  }

  public double calculateTax(double income) {
    if (income > 0)
      return income * this.taxRate;
    else
      return 0.0d;
  }
  
}
