public class StudentAdvance extends Advance {

    public StudentAdvance(int daysInAdvance){
        super(daysInAdvance);
    }

    public double getPrice(){
        return super.getPrice()*0.5;
    }

    public String toString(){
        return super.toString()+"\n(student ID required)";
    }
    
}
