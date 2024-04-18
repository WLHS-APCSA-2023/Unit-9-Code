import java.util.Random;
public class Ticket {
    private int serialNumber;
    private static Random randNumber;

    public Ticket(){
        serialNumber = getNextSerialNumber();
    }

    public double getPrice(){
        return 0.0;
    }

    public String toString(){
        return "Number: " + serialNumber + "\nPrice: " + getPrice();
    }

    public static int getNextSerialNumber(){
        randNumber = new Random();
        return randNumber.nextInt(10000);
    }
}
