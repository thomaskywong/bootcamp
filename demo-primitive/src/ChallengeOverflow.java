public class ChallengeOverflow {
  public static void main(String[] args) {

    int k1 = 127;
    byte value = (byte) k1;
    for (int i= 0; i < 10; i++) {
      value++;
      System.out.println(value);
    }
    // Byte: 
    // 0111_1111 = 127
    // 1000_0000 = -128
    // 1000_0001 = -127

  }
}
