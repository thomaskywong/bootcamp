package filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class PractiseFileReader {
  public static void main(String[] args) throws Exception {
    int value = 0;
    try (FileReader file = new FileReader("C:\\software\\Git\\github\\bootcamp\\README2.md")) {
      value = file.read();
    } catch (FileNotFoundException ex) {
      System.out.println("File not found! Please check the file name.");
      throw ex;
    } 

  }
}
