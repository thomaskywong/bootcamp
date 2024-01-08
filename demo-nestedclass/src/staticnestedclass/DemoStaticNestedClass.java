public class DemoStaticNestedClass { // Outer class

    public static int score = 100;
    private int score2;

    public DemoStaticNestedClass(int score2) {
        this.score2 = score2;
    }

    public int getScore2() {
        return this.score2;
    }

    public static class Calculator { // nested static class

        // attributes
        private int x;

        // constructor
        public Calculator(int x) {
            this.x = x;
        }

        // instance method
        public void add(int y) {
            this.x = this.x + y;
        }

        public int getX() {
            return this.x;
        }

        public int scorePlusX() {
            return this.x + DemoStaticNestedClass.score;
        }

        // public int score2PlusX() {
        //     return this.x + super.score2;       // compilation error. cannot access outer class instance variable
        // }

    }

}
