
// Create Class for Car Details or Info
class carsDetails{
    String cName = "Mercedes-Benz";
    int cQuantity = 23;
    int cModel = 2023;
}

public class Java_Class_Object {
    public static void main(String[] args) {
        // Create object obj instance of carDetails class
        carsDetails obj = new carsDetails();

        System.out.println("Car Name : " + obj.cName);
        System.out.println("Car MFG Year : " + obj.cModel);
        System.out.println("Car Total Quantity : " + obj.cQuantity);
    }
}
