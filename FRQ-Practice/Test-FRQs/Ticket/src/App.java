public class App {
    public static void main(String[] args) throws Exception {
        Ticket advanceOne = new Advance(10);
        System.out.println(advanceOne);
        Ticket studentAdvanceOne = new StudentAdvance(10);
        System.out.println(studentAdvanceOne);
    }
}
