public class PieTester {
    public static void main(String[] args) {
        Pie pumpkin = new Pie("Pumpkin",12);
        ApplePie classic = new ApplePie(10);

        classic.eatSlice();
        classic.eatSlice();
        System.out.println(classic);
        System.out.println(pumpkin);
        pumpkin.eatSlice();
        System.out.println(pumpkin);
    }
    
}

