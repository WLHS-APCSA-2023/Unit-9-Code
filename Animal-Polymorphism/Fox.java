public class Fox extends Canine {
    
    public Fox(String name){
        super(name);
    }

    public String speak(){
        return "Ring-ding-ding-ding-dingeringeding";
    }
    public String getName(){
        return super.getName();
    }
}
