public class IntegerPrinter {

    // Generic printer
    // cannot use Object as type of reference, then use instanceof to check, since there are infinite numbers of object type
    //private Integer x;
    private Integer x;

    public IntegerPrinter(Integer x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return String.valueOf(this.x);
    }

    public static void main(String[] args) {
        IntegerPrinter p = new IntegerPrinter(10);

        System.out.println(p);
    }
}
