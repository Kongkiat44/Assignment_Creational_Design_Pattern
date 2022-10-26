package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.StringWriter;
import java.util.Arrays;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private StringWriter writer;
    public JSONBookMetadataFormatter(){
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see fit.
        writer = new StringWriter();
        return null;
    }

    @Override
    @SuppressWarnings("unchecked")
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see fit.
        JSONObject obj = new JSONObject();
        JSONArray arr = new JSONArray();
        String[] authors = b.getAuthors();

        arr.addAll(Arrays.asList(authors));
        obj.put("ISBN", b.getISBN());
        obj.put("Title", b.getTitle());
        obj.put("Publisher", b.getPublisher());
        obj.put("Authors", arr);

        writer.write(obj.toString() + "\n");
        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.
        return writer.toString();
    }
}
