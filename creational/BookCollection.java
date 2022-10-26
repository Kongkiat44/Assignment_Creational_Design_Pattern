//DO NOT MODIFY THE CODE IN THIS FILE
package creational;

import java.util.HashSet;
import java.util.Set;

public abstract class BookCollection {
    protected Set<Book> books;

    public BookCollection() {
        books = new HashSet<>();
    }

    public void add(Book b) {
        books.add(b);
    }

    public void remove(Book b) {
        books.remove(b);
    }
}
