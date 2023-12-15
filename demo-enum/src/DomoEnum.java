public class DomoEnum {
    public static void main(String[] args) {
        
        // Color
        String color = "RED";
        color = "Red";
        color = "red";
        color = "RED ";
        color = "R  ed."

    }

    public static int convert(String color) {
        if (color.toUpperCase().equals("RED"))
            return 1;
        return 2;
    }
}
