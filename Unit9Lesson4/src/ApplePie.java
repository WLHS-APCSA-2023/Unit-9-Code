public class ApplePie extends Pie {

    public ApplePie(int slices){
        super("Apple",slices);
    }

    public boolean hasSlice(){
        return super.getSlices() > 0; //super is optional
    }

    @Override
    public void eatSlice(){
        if(hasSlice()){
            super.eatSlice(); //has to be super to get to eatSlice in super
        }
    }

    @Override
    public String toString(){
        return "This apple pie has "+super.getSlices()+" slices.";
    }
    
}
