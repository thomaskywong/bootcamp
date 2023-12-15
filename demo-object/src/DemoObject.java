public class DemoObject { // implicitly extends Object

    private int age;

    public DemoObject() {

    }

    public DemoObject(int age) {
        this.age = age;
    }


    public void run() {

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DemoObject)) {
            return false;
        }
        DemoObject newObj = (DemoObject) obj;

        return this.age == newObj.age;
    }

    public static void main(String[] args) {

        // Example 1: new DemoObject()
        DemoObject do2 = new DemoObject();

        // upcast: do2 (DemoObject) -> o2 (Object)
        Object o2 = do2;
        // compile time -> do2 is an object reference with the type of DemoObject, which contains run()
        // runtme -> do2 is a DemoObject object, so run() has no runtime error
        do2.run();

        // compile time -> o2 is an object reference with the type of Object, which does not contains run() -> compile time error
        // o2.run();

        // runtime -> o2 is a Object object, so toString() has no runtime error
        System.out.println(o2.toString());

        // Example 2: new Object()
        Object o1 = new Object();
        System.out.println(o1.toString()); // java.lang.Object@36baf30c

        // downcast: o1 (Object) -> do1 (DemoObject)
        if (o1 instanceof DemoObject) {
            DemoObject do1 = (DemoObject) o1; // downcast
            // compile time -> do1 is an object reference with the type of DemoObject, which contains run()
            // runtime -> o1 found the actual object is Object, and the Object has no run() -> runtime error
            do1.run();
        }

        // .getClass() method
        DemoObject do3 = new DemoObject();

        Class<?> clas = do3.getClass();
        System.out.println(clas.getName());
        System.out.println(clas.getClass());

        if (do3.getClass() == DemoObject.class) { // instanceof
            System.out.println("It is DemoObject Class");
        }
        System.out.println(do3.getClass().hashCode());
        System.out.println(DemoObject.class.hashCode());

        if (do3.getClass().equals(DemoObject.class)) { // instanceof
            System.out.println("It is DemoObject Class 2");
        }
        System.out.println(do3.getClass().toString());
        System.out.println(DemoObject.class.toString());

        // equals()
        String s1 = "Hello";
        String s2 = "World!";
        System.out.println(s1 == s2); // check if same address
        System.out.println(s1.equals(s2)); // check if same value in String

        System.out.println(do2.equals(o2));// check if same address in Object

        // .equals() in Object
        // public boolean equals(Object obj) {
        //     return (this == obj);
        // }
    

        // .equals() in String override .equals in Object 
        // public boolean equals(Object anObject) {
        //     if (this == anObject) {
        //         return true;
        //     }
        //     return (anObject instanceof String aString)
        //             && (!COMPACT_STRINGS || this.coder == aString.coder)
        //             && StringLatin1.equals(value, aString.value);
        // }
        
        // Cat equals()
        System.out.println();
        System.out.println("Overriding .equals() method");

        Object obj1 = new DemoObject(10);
        DemoObject obj2 = new DemoObject(10);
        
        DemoObject obj3 = new DemoObject();
        if (obj1 instanceof DemoObject) {
            obj3 = (DemoObject) obj1;
        }

        DemoObject obj4 = new DemoObject(20);

        Object obj5 = new Object();
        DemoObject obj6 = new DemoObject(0);
        if (obj5 instanceof DemoObject) {   // Not true
            obj6 = (DemoObject) obj5;
        }

        System.out.println(obj1.equals(obj1));      // true. Same object
        System.out.println(obj1.equals(obj2));      // true. Same attribute values. Done by overriden .equals() method   
        System.out.println(obj1.equals(obj4));      // false.
        System.out.println(obj1.equals(obj3));      // true. Down cast from obj1
        System.out.println(obj1.equals(obj4));      // false. Different object
        System.out.println(obj5.equals(obj6));      // false. Cannot downcast. Different object class

         
    }
}
