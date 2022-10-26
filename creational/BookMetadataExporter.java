package creational;

import java.io.PrintStream;
import java.util.Iterator;

public abstract class BookMetadataExporter extends BookCollection {

    public void export(PrintStream stream) {
        BookMetadataFormatter formatter = createFormat();
        Iterator b = books.iterator();
        while(b.hasNext()){
            formatter.append((Book)b.next());
        }
        stream.print(formatter.getMetadataString());
    }

    public abstract BookMetadataFormatter createFormat();
}