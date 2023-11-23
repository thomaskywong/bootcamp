public class DemoIf {

    public static void main(String[] args) {
        // double salary = 15000.0d;

        // if (salary > 14000) {
        // System.out.println("salary > 14000");
        // }

        // if (salary >= 15000) { // integer cast to double automatically by JAVA
        // System.out.println("salary >= 15000");
        // }

        // if (salary < 17000) {
        // System.out.println("salary < 17000");
        // }

        // if (salary <= 15000) { // integer cast to double automatically by JAVA
        // System.out.println("salary <= 15000");
        // }

        // // if statement on char
        // char grade = 'F';
        // if (grade == 'A') {
        // System.out.println("Grade: A");
        // } else if (grade == 'B') {
        // System.out.println("Grade: B");
        // } else if (grade == 'C') {
        // System.out.println("Grade: C");
        // } else if (grade == 'D') {
        // System.out.println("Grade: D");
        // } else if (grade == 'E') {
        // System.out.println("Grade: E");
        // } else if (grade == 'F') {
        // System.out.println("Fail");
        // }


        // int Score = 85; // assume score <= 100
        // char grade;

        // if (Score >= 90 && Score <= 100)
        // grade = 'A';
        // else if (Score >= 80)
        // grade = 'B';
        // else if (Score >= 70)
        // grade = 'C';
        // else if (Score >= 60)
        // grade = 'D';
        // else if (Score >= 50)
        // grade = 'E';
        // else
        // grade = 'F';

        // System.out.print("Score= " + Score);
        // System.out.println("; Grade= " + grade);

        // System.out.println();
        // // score = 0;
        // // grade = 'A';

        // if (Score < 50 && Score >= 0)
        // grade = 'F';
        // else if (Score < 60)
        // grade = 'E';
        // else if (Score < 70)
        // grade = 'D';
        // else if (Score < 80)
        // grade = 'C';
        // else if (Score < 90)
        // grade = 'B';
        // else
        // grade = 'A';


        // System.out.print("Score= " + Score);
        // System.out.println("; Grade= " + grade);

        int score1 = 100;
        int score2 = 49;
        char grade;

        if (score1 < 50 || score2 < 50) {
            grade = 'F';
        } else {
            double avgScore = (score1 + score2) / 2;            // avgScore is declared and only valid within else {} block
            if (avgScore >= 90 && avgScore <= 100)
                grade = 'A';
            else if (avgScore >= 80)
                grade = 'B';
            else if (avgScore >= 70)
                grade = 'C';
            else if (avgScore >= 60)
                grade = 'D';
            else
                grade = 'E';
        }
        System.out.println("Score 1 = " + score1);
        System.out.println("Score 2 = " + score2);
        System.out.println("Grade = " + grade);
        
        if (score1 >= 50 && score2 >= 50) {
            double avgScore = (score1 + score2) / 2;            // avgScore is declared and only valid within else {} block
            if (avgScore >= 90 && avgScore <= 100)
                grade = 'A';
            else if (avgScore >= 80)
                grade = 'B';
            else if (avgScore >= 70)
                grade = 'C';
            else if (avgScore >= 60)
                grade = 'D';
            else
                grade = 'E';
        } else {
            grade = 'F';  
        }

        System.out.println("Score 1 = " + score1);
        System.out.println("Score 2 = " + score2);
        System.out.println("Grade = " + grade);
    }
}
