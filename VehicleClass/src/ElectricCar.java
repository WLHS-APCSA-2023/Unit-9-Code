public class ElectricCar extends Car {

    private boolean hasFrunk;
    private String chargingPortType;
    private double wattHours;
    private double percentChargeRemaining;

    public ElectricCar(int numWheels, String color, int numDoors, boolean isElectric, String make, String model,
            String driveTrain, String plateNumber, int year, boolean backupCamera, boolean hasFrunk,
            String chargingPortType, double wattHours, double percentChargeRemaining) {
        super(numWheels, color, numDoors, true, make, model, driveTrain, plateNumber, year, backupCamera);
        this.hasFrunk = hasFrunk;
        this.chargingPortType = chargingPortType;
        this.wattHours = wattHours;
        this.percentChargeRemaining = percentChargeRemaining;
    }

    

    
}
