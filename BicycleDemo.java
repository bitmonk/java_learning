class BicycleDemo {
    public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        System.out.println("Bike 1 away!");

        // Invoke methods on 
        // those objects
        bike1.changeCadence(50);
        bike1.printStates();
        bike1.speedUp(10);
        bike1.printStates();
        bike1.shiftUp();
        bike1.printStates();

        System.out.println("Bike 2 away!");

        bike2.changeCadence(50);
        bike2.printStates();
        bike2.speedUp(10);
        bike2.printStates();
        bike2.shiftUp();
        bike2.printStates();
        bike2.changeCadence(40);
        bike2.printStates();
        bike2.speedUp(10);
        bike2.printStates();
        bike2.shiftUp();
        bike2.printStates();
    }
}
