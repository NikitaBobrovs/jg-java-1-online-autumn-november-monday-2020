package students.viktors_cesnokovs.lesson_3.level_7.task_29;

public class PetrolStation {
    String name;
    String fuelType;
    double price;

    public PetrolStation(String name, String fuelType, double price){
        this.name = name;
        this.fuelType = fuelType;
        this.price = price;
    }
    void changeFuelType(String newFuelType){ this.fuelType = newFuelType;}
    void changePrice(double newPrice){ this.price = newPrice;}
    void printInfo(){
        System.out.println("На "+ this.name + this.fuelType +" стоит - "+ this.price + " $.");
    }
}



class PetrolStationDemo{
    public static void main(String[] args) {
        PetrolStation newPetrolstation = new PetrolStation("Circle K ","дизель",1.038);
        newPetrolstation.printInfo();
        System.out.println();

        newPetrolstation.changeFuelType("бензин");
        newPetrolstation.changePrice(1.128);
        newPetrolstation.printInfo();
    }
}
