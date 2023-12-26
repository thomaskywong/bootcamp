package comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoComparable {
    public static void main(String[] args) {
        // Comparable is an Interface
        // .compareTo( )

        List<Student> students = new ArrayList<>();

        students.add(new Student(40, "Peter"));
        students.add(new Student(30, "John"));
        students.add(new Student(100, "Mary"));
        students.add(new Student(20, "John"));

        // Comparable example
        Collections.sort(students);
        System.out.println(students);
        System.out.println();

        // Comparator example
        Collections.sort(students, new SortByScore());
        System.out.println(students);

        students.add(new Student(100, "Tiffany"));
        students.add(new Student(50, "Gordon"));
        students.add(new Student(60, "Tiffany"));
        System.out.println(students);
        System.out.println();

        System.out.println("Sort by Score");
        Collections.sort(students, new SortByScore());
        System.out.println(students);
        System.out.println();
        
        System.out.println("Sort by Name");
        Collections.sort(students, new SortByName());
        System.out.println(students);



    }
}
