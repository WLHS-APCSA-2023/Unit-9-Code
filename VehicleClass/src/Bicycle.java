public class Bicycle extends Vehicle {

    private int numGears;
    private int height;
    private boolean hasBell;
    private double wheelRadius;
    private boolean hasTrainingWheels;

    public Bicycle(int numWheels, String color, int numDoors, boolean isElectric, String make, String model,
            int numGears, int height, boolean hasBell, double wheelRadius, boolean hasTrainingWheels) {
        super(2, color, 0, isElectric, make, model);
        this.numGears = numGears;
        this.height = height;
        this.hasBell = hasBell;
        this.wheelRadius = wheelRadius;
        this.hasTrainingWheels = hasTrainingWheels;
    }

    


    
}
