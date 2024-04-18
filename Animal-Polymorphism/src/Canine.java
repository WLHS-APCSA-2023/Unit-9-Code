package src;
public class Canine{
    private String name;
    
    public Canine(String name){
        this.name = name;
    }

    public String speak(){
        return "Woof";
    }
    
    public String getName(){
        return name;
    }
}