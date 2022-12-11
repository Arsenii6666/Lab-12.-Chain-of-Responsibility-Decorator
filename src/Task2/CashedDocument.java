package Task2;

import org.threeten.bp.LocalTime;

public class CashedDocument implements Document{
    Document document;
    String cash;
    public CashedDocument(Document document){
        this.document=document;
    }
    @Override
    public String parse() {
        if(cash!=null){
            return cash+"\nCashed";
        }
        String text=document.parse();
        cash=text;
        return text;
    }
}
