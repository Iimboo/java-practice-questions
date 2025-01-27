/*Design a simple vehicle hierarchy with a base class 'Vehicle' and two subclasses 'Car' and 'Motorcycle'. The 'Vehicle' class should have properties 'brand' and 'year'. 'Car' should add a 'numDoors' property, while 'Motorcycle' should add a 'hasSidecar' property. Implement appropriate constructors and a 'displayInfo()' method for each class. Create instances based on user input and display their information. Input: Read three lines containing the vehicle type ("Car" or "Motorcycle"), brand, and year. For Car, also read the number of doors. For Motorcycle, read a boolean indicating if it has a sidecar. Output: Print the vehicle information using the displayInfo() method.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        class Vehicle{
            private String brand;
            private int year;
            public String getBrand(){
                return brand;
            }
            public void setBrand(String brand){
                this.brand = brand;
            }
            public int getYear(){
                return year;
            }
            public void setYear(int year){
                this.year = year;
            }
        }
        class Car extends Vehicle{
            private int numDoors;
            public int getNumDoors(){
                return numDoors;
            }
            public void setNumDoors(int numDoors){
                this.numDoors = numDoors;
            }
            public Car(String brand, int year, int numDoors){
                super.setBrand(brand);
                super.setYear(year);
                this.setNumDoors(numDoors);
            }
            public void displayInfo(){
                System.out.println(super.getBrand()+" ("+super.getYear()+")");
                System.out.println("Number of doors: "+this.getNumDoors());
            }
        }
        class Motorcycle extends Vehicle{
            private boolean hasSidecar;
            public boolean getHasSidecar(){
                return hasSidecar;
            }
            public void setHasSidecar(boolean hasSidecar){
                this.hasSidecar = hasSidecar;
            }
            public Motorcycle(String brand, int year, boolean hasSidecar){
                super.setBrand(brand);
                super.setYear(year);
                this.setHasSidecar(hasSidecar);
            }
            public void displayInfo(){
                System.out.println(super.getBrand()+" ("+super.getYear()+")\nHas sidecar: "+this.getHasSidecar()+"\n");
            }
        }


        // Read input and create appropriate vehicle object
        String vehicleType = scanner.nextLine();
        String brand = scanner.nextLine();
        int year = Integer.parseInt(scanner.nextLine());

        if (vehicleType.equals("Car")) {
            int numDoors = Integer.parseInt(scanner.nextLine());
            // TODO: Create a Car object and call displayInfo()
            Car carr = new Car(brand,year,numDoors);
            carr.displayInfo();
            
        } else if (vehicleType.equals("Motorcycle")) {
            boolean hasSidecar = Boolean.parseBoolean(scanner.nextLine());
            // TODO: Create a Motorcycle object and call displayInfo()
            Motorcycle motor = new Motorcycle(brand,year,hasSidecar);
            motor.displayInfo();
        }

        scanner.close();
    }
}
