public class PictureBook extend Book{

    private String illustrator;

    public PictureBook(String t, String a, String illustrator){
        super(t,a);
        this.illustrator = illustrator;
    }

    public void printBookInfo(){
        System.out.println(title+", written by "+author+" and illustrated by "+illustrator);
    }
    
}
