public class Poodle extends Dog {
    
    public Poodle(String name){
        super(name);
    }

    public String speak(){
        return "yip";
    }
    public String getName(){
        return super.getName();
    }
}
