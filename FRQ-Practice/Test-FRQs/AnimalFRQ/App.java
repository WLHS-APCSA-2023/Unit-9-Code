public class App {
    public static void main(String[] args) throws Exception {
        Pet millie = new Cat("Millie");
        Pet lily = new Dog("Lilly");
        Pet cosmo = new LoudDog("Cosmo");
        Kennel dayCare = new Kennel();
        dayCare.addPet(cosmo);
        dayCare.addPet(millie);
        dayCare.addPet(lily);
        System.out.println(dayCare.allSpeak());
    }
}
