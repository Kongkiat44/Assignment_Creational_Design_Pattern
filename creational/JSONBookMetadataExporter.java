package creational;

public class JSONBookMetadataExporter extends BookMetadataExporter{
    @Override
    public BookMetadataFormatter createFormat(){
        return new JSONBookMetadataFormatter();
    }
}
