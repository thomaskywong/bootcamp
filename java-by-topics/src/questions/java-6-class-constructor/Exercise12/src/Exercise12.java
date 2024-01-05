/**
 * Expected Output:
 * Car Year=2020, Car Model=ModelY
 */
public class Exercise12 {
    // Declare instance variables carYear and carModel
    private int carYear;
    private String carModel;

    public Exercise12(int carYear, String carModel) {
        this.carYear = carYear;
        this.carModel = carModel;
    }

    public int getCarYear() {
        return this.carYear;
    }

    public String getCarModel() {
        return this.carModel;
    }

    // Constructor with variables carYear and carModel

    public static void main(String[] args) {
        Exercise12 myCar = new Exercise12(2020, "ModelY");
        // Create an instance of class Exercise12, with carYear 2020, and carModel "ModelY"
        // print the expected output
        System.out.println("Car Year=" + myCar.getCarYear() + ", Car Model=" + myCar.getCarModel());
    }
}
