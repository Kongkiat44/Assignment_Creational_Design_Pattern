package creational;

import java.io.IOException;

public class CSVBookMetadaExporter extends BookMetadataExporter{
    @Override
    public BookMetadataFormatter createFormat(){
        BookMetadataFormatter formatter;
        try {
            formatter = new CSVBookMetadataFormatter();
            return formatter;
        }
        catch (IOException e){
            System.out.println("CSV Format Error");
            e.printStackTrace();
            return null;
        }
    }
}
