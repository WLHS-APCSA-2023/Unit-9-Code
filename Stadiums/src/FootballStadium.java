public class FootballStadium extends Stadium {

    private String teamName;

    public FootballStadium(String name, String city, String teamName){
        super(name, city);
        this.teamName = teamName;
    }
    
    public void printInfo(){
        // Suppose in the tester we had
        // FootballStadium bowl = new FootballStadium("Megacorp","Orlando",   "Flamingos")
        // fill in the code so that bowl.printInfo() will result in:
        // "MegaCorp Stadium in Orlando - Home of the Flamingos"
        super.printInfo();
        System.out.println(" - Home of the " + teamName);
    }
}
