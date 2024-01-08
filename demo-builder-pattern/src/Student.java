import java.util.ArrayList;
import java.util.List;

public class Student {
    // Builder pattern Advatages:
    // 1.if you want to control the access to "setters" after the object created, builder pattern is good practise
    // 2. Do not have to create too much constructor according to the number of attributes. Use builder's setter to assign value

    private String name;
    private int age;
    private List<String> subjects;

    // 10 fields ... all arg constructor -> 1 constructor
    // What if 9 fields constructor? -> N constructor

    // private Student's contructor
    private Student(String name, int age, List<String> subjects) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }

    // private Student's contructor
    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.subjects = builder.subjects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public List<String> getSubjects() {
        return this.subjects;
    }

    // add public static nested class
    public static class Builder {

        private String name;
        private int age;
        private List<String> subjects;

        // Setter of inner class builder
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder subjects(List<String> subjects) {
            this.subjects = subjects;
            return this;
        }

        // Build method for builder
        // public Student build() {
        // return new Student(this.name, this.age, this.subjects);
        // }

        public Student2 build() {
            return new Student2(this);
        }

    }

    public static void main(String[] args) {

        // original way
        Student2 student1 = new Student2("Thomas", 44,
                new ArrayList<>(List.of("Maths", "Physics", "English")));

        // builder way
        Student2 student2 = new Builder()
                            .name("John").age(44)
                            .subjects(List.of("Maths", "English"))
                            .build();

        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getSubjects());

        // encapsulated builder
        Student2 student3 = Student2.builder()
                        .name("May")
                        .age(15)
                        .subjects(List.of("Maths", "Physics"))
                        .build();
        
        System.out.println();
        System.out.println(student3.getName());
        System.out.println(student3.getAge());
        System.out.println(student3.getSubjects());



    }
}
