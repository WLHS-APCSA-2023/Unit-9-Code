import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Canine>canineKennel = new ArrayList<Canine>();
        Canine doggy = new Dog("doggy");
        canineKennel.add(doggy);
        System.out.println(doggy.speak());
        System.out.println(doggy.getName());
        ((Dog)doggy).fetch();
        for (Canine canine:canineKennel){
            System.out.println(canine.getName());
        }
        
    }

    public static class Canine{
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

    public static class Dog extends Canine {
    
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

    public static class Poodle extends Dog {
    
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

    public static class Fox extends Canine {
    
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
}


