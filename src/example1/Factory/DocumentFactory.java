package example1.Factory;

import example1.documents.Document;

// This is the DocumentFactory abstract class. It has an abstract createDocument method.
public interface DocumentFactory {
    public abstract Document createDocument();
}
