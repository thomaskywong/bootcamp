public class IntegerPrinter {

    // Generic printer
    // cannot use Object as type of reference, then use instanceof to check, since there are infinite numbers of object type
    //private Integer x;
    private Integer x;

    // public Printer(Integer x) {
    //     this.x = x;
    // }

    public IntegerPrinter(Integer x) {
        this.x = x;
    }
    // public Integer getX() {
    //     return this.x;
    // }

    public static void main(String[] args) {
        IntegerPrinter p = new IntegerPrinter(10);

        System.out.println(p.getX());

        Object o = p.getX2();
        System.out.println(o.toString());

    }
}
