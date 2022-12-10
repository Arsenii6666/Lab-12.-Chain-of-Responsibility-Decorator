package Task1;

public class Main {
    public static void main(String[] args) {
        Handler50 h50=new Handler50();
        Handler20 h20=new Handler20();
        Handler10 h10=new Handler10();
        Handler5 h5=new Handler5();
        h50.setNext(h20);
        h20.setNext(h10);
        h10.setNext(h5);
        h50.process(530);
    }
}
