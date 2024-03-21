public class Building {
    private String buildingType;

    public Building(String buildingType){
        this.buildingType = buildingType;
    }

    public void printInfo(){
        System.out.println("This building is a " + buildingType);
        System.out.println("It is known as: ");
    }
}
