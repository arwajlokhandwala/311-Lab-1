package org.example;



public class Car extends Vehicle {

    private String brand;

    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand){
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void honk(){
        System.out.println("Honk, honk!");
    }

    public String displayInfo(){

        return "Car Brand: " + brand +
                "\nColor: " + getColor() + "\nEngine Size: " + getEngineSize()
                + "\nFuel Type: " + getFuelType() + "\nNumber of Wheels: " + getNumberOfWheels();
    }
}


