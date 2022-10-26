package creational;

import javax.xml.parsers.ParserConfigurationException;

public class XMLBookMetadataExporter extends BookMetadataExporter{
    @Override
    public BookMetadataFormatter createFormat(){
        BookMetadataFormatter formatter;
        try {
            formatter = new XMLBookMetadataFormatter();
            return formatter;
        }
        catch (ParserConfigurationException e){
            System.out.println("XML Format Error");
            e.printStackTrace();
            return null;
        }
    }
}
