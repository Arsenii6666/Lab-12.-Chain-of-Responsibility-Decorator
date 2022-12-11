package Task2;

import org.threeten.bp.LocalTime;

public class TimeDocument implements  Document{
    Document document;

    public TimeDocument(Document document){
        this.document=document;
    }
    @Override
    public String parse() {
        long start=System.currentTimeMillis();
        String text=document.parse();
        Long time=System.currentTimeMillis()-start;
        return text+"\n"+time.toString();
    }
}
