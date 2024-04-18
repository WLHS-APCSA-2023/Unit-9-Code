package src;
public class Dog extends Canine {
    
    public Dog(String name){
        super(name);
    }

    public String speak(){
        return "bark";
    }

    public void fetch(){
        System.out.println("Returned a stick");
    }

    public String getName(){
        return super.getName();
    }

    
}
