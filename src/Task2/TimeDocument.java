package Task2;

public class TimeDocument implements  Document{
    Document document;

    public TimeDocument(Document document){
        this.document=document;
    }
    @Override
    public String parse() {
        String text=document.parse();
        return null;
    }
}
