package practicegenerics1;

import box.Square;

public class PraticeGenericClass {

  public static void main(String[] args) {

    Printer1<Integer> printer1 = new Printer1<>(1);
    System.out.println(printer1); // 1

    Printer1<Double> printer2 = new Printer1<>(2.0d);
    System.out.println(printer2); // 2.0

    Printer1<Long> printer3 = new Printer1<>(3L);
    System.out.println(printer3); // 3

    Printer1<Float> printer4 = new Printer1<>(4.0f);
    System.out.println(printer4); // 4.0

    Printer1<Short> printer5 = new Printer1<>((short) 5);
    System.out.println(printer5); // 5

    Printer1<Byte> printer6 = new Printer1<>((byte) 6);
    System.out.println(printer6); // 6

    Printer1<Byte> printer7 = new Printer1<>((byte) 6);
    System.out.println(printer7); // 6

    System.out.println(printer7.equals(printer6)); // true
    System.out.println(printer6.hashCode()); // 37
    System.out.println(printer7.hashCode()); // 37

    printer7.setItem((byte) -128);
    System.out.println(printer7); // -128.

    // SquareOf<T extends Number>
    SquareOf<Integer> sq1 = new SquareOf<>(1);
    SquareOf<Double> sq2 = new SquareOf<>(2.0d);
    SquareOf<Long> sq3 = new SquareOf<>(3L);
    SquareOf<Byte> sq4 = new SquareOf<>((byte) 4);
    SquareOf<Short> sq5 = new SquareOf<>((short) 5);
    SquareOf<Float> sq6 = new SquareOf<>(6.0f);

    System.out.println(sq1.squareOf()); // 1.0
    System.out.println(sq2.squareOf()); // 4.0
    System.out.println(sq3.squareOf()); // 9.0
    System.out.println(sq4.squareOf()); // 16.0
    System.out.println(sq5.squareOf()); // 25.0
    System.out.println(sq6.squareOf()); // 36.0

  }
}


