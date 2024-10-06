import example1.Factory.DocumentFactoryProducer;
import example1.documents.Document;
import example1.Factory.DocumentFactory;
import task2.buttons.Button;
import task2.checkboxes.Checkbox;
import task2.factory.FactoryDarkTheme;
import task2.factory.FactoryLightTheme;
import task2.factory.FactoryTheme;

// This is the Main class. It creates a PDF document and a Word document.
public class Main {
    public static void main(String[] args) {
        documentTest();
        guiTest();
    }

    public static void documentTest() {
        DocumentFactory pdfFactory = DocumentFactoryProducer.getFactory("PDF");
        Document pdfDocument = pdfFactory.createDocument();
        pdfDocument.create();

        // Create Word document
        DocumentFactory wordFactory = DocumentFactoryProducer.getFactory("WORD");
        Document wordDocument = wordFactory.createDocument();
        wordDocument.create();
    }

    public static void guiTest() {
        FactoryTheme factoryLightTheme = new FactoryLightTheme();
        Button LihgtButton = factoryLightTheme.createButton();
        Checkbox LightCheckbox = factoryLightTheme.createCheckbox();

        LihgtButton.display();
        LightCheckbox.display();

        FactoryTheme factoryDarkTheme = new FactoryDarkTheme();
        Button DarkButton = factoryDarkTheme.createButton();
        Checkbox DarkCheckbox = factoryDarkTheme.createCheckbox();

        DarkButton.display();
        DarkCheckbox.display();
    }

}