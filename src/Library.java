import java.util.ArrayList;
import java.util.Optional;

public class Library {
    private final ArrayList<Book> collection;

    public Library(ArrayList<Book> collection) {
        this.collection = collection;
    }

    public void add(Book book) {
        collection.add(book);
    }

    public void remove(Book book) {
        collection.remove(book);
    }

    public Optional<Book> search(String key) {
        for (Book currentBook : collection) {
            if (key.equals(currentBook.getTitle())) {
                return Optional.of(currentBook);
            }
        }

        return Optional.empty();
    }

    public Optional<Book> search(int ISBN) {
        for (Book currentBook : collection) {
            if (ISBN == currentBook.getISBN()) {
                return Optional.of(currentBook);
            }
        }

        return Optional.empty();
    }
}
