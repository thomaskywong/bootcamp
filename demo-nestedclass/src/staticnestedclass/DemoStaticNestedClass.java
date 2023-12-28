public class DemoStaticNestedClass {    // Outer class

    public static int score;
    public static class Calculator {    // nested static class

        // attributes
        private int x;

        // constructor
        public Calculator (int x) {
            this.x = x;
        }

        // instance method
        public void add(int y) {
            this.x = this.x + y;
        }

        public int getX() {
            return this.x;
        }

    }

    public static void main(String[] args) {
        DemoStaticNestedClass d = new DemoStaticNestedClass();
        DemoStaticNestedClass.Calculator c = new DemoStaticNestedClass.Calculator();

        Calculator calculator = new Calculator();


    }
}
