
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DemoConsumer {

  public static void main(String[] args) {

    Consumer<String> sendEmailFunction =
        emailAddress -> sendEmail(emailAddress);

    List<String> emails = new ArrayList<>(List.of(""));

    emails.forEach(sendEmailFunction);

    // common way to use Lambda in .forEach()
    emails.forEach(x -> sendEmail(x));
    System.out.println();

    List<Book> books = new ArrayList<>(List.of(new Book(10), new Book(200)));

    // method 1:
    Consumer<Book> consumer = x -> System.out.println(x.getPrice());
    books.forEach(consumer);
    
    // method 2
    books.forEach( x -> System.out.println(x.getPrice()));

    // Other practise:
    List<Student> students = new ArrayList<>(List.of(new Student("Thomas"), new Student("Emily"), new Student("Gordon")));

    students.forEach(x -> System.out.println(x.getName()));
    System.out.println();

    // Equivalent (But old school style. Never use this way)
    Consumer<Student> consumer2 = x -> System.out.println(x.getName());
    for (Student student : students) {
      consumer2.accept(student);
    }


  }

  public static boolean sendEmail(String emailAddress) {
    System.out.println("I am sending email..." + emailAddress);
    return true;
  }

}


