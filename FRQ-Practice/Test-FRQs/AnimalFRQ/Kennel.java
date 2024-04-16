import java.util.ArrayList;

public class Kennel {
    private ArrayList<Pet> petList;

    public Kennel(){
        petList = new ArrayList<Pet>();
    }

    public void addPet(Pet pet){
        petList.add(pet);
    }

    public String allSpeak(){
        String out = "";
        for(Pet pet:petList){
            out += pet.speak();
        }
        return out;
    }
}
