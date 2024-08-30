package org.example;

public class Vehicle {

   private int numberOfWheels ; //  number of wheels on vehicle
   private String color; // color of vehicle
   private float engineSize; // engine size of vehicle
   private String fuelType; // fuel type used by vehicle

    // default constructor
   public Vehicle(){
       numberOfWheels = 0;
       color = "N/A";
       engineSize = 0;
       fuelType = "N/A";
   }

   // parameterized constructor
   public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType) {
       this.numberOfWheels = numberOfWheels;
       this.color = color;
       this.engineSize = engineSize;
       this.fuelType = fuelType;
   }

   // accessor method for engineSize
    public float getEngineSize() {
        return engineSize;
    }

    //accessor method for numberOfWheels
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    // accessor method for color
    public String getColor() {
        return color;
    }

    // accessor method for fuelType
    public String getFuelType() {
        return fuelType;
    }

    // mutator method for engineSize
    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    // mutator method for numberOfWheels
    public void setNumberOfWheels(int numberOfWheels) {
       this.numberOfWheels = numberOfWheels;
    }

    // mutator method for color
    public void setColor(String color) {
       this.color = color;
    }

    //mutator method for fuelTypes
    public void setFuelType(String fuelType) {
       this.fuelType = fuelType;
    }
}
