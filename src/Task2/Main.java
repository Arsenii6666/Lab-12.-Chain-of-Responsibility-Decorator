package Task2;

public class Main {
    public static void main(String[] args) {
        Document document = new SmartDocument("gs://oop-course/Geico-2021.png");
        document = new TimeDocument(document);
        document = new CashedDocument(document);
        System.out.println(document.parse());
    }
}

