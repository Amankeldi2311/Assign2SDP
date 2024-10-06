package example1.Factory;

public class DocumentFactoryProducer {
    public static DocumentFactory getFactory(String type) {
        if (type.equalsIgnoreCase("PDF")) {
            return new PDFFactory();
        } else if (type.equalsIgnoreCase("WORD")) {
            return new WordFactory();
        }
        throw new IllegalArgumentException("Document type not supported");
    }
}
