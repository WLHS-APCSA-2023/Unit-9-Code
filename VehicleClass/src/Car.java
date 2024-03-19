public class Car extends Vehicle{

    private String driveTrain; //AWD, FWD, 4WD, RWD
    private String plateNumber;
    private int year;
    private boolean backupCamera;
    private double range;
    private double tankSize;

    public Car(int numWheels, String color, int numDoors, boolean isElectric, String make, String model,
            String driveTrain, String plateNumber, int year, boolean backupCamera) {
        super(numWheels, color, numDoors, isElectric, make, model);
        this.driveTrain = driveTrain;
        this.plateNumber = plateNumber;
        this.year = year;
        this.backupCamera = backupCamera;
    }

    

}