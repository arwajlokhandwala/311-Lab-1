package org.example;


public class Car extends Vehicle {

    private String brand; // brand of Car

    // parameterized constructor for Car object
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand){
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    // accessor method for brand name
    public String getBrand() {
        return brand;
    }

    //mutator method for brand name
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // honk() method - prints "Honk,honk!"
    public void honk(){
        System.out.println("Honk, honk!");
    }

    // displayInfo method - displays car info including brand, fuel type, engine size, number of wheels and color
    public String displayInfo(){

        return "Car Brand: " + brand +
                "\nColor: " + getColor() + "\nEngine Size: " + getEngineSize()
                + "\nFuel Type: " + getFuelType() + "\nNumber of Wheels: " + getNumberOfWheels();
    }
}


