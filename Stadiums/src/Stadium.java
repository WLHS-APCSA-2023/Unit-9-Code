public class Stadium extends Building {
    private String name;
    private String city;

    public Stadium(String name, String city){
        super("Stadium");
        this.name = name;
        this.city = city;
    }

    public void printInfo(){
        super.printInfo();
        System.out.print(name + " Stadium in " + city);
    }
    
}
