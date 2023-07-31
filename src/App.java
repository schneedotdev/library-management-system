import java.util.ArrayList;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1234, Availability.AVAILABLE);

        Library lib = new Library(new ArrayList<>());
        lib.add(book);

        int[] listOfISBNs = {1230, 1234, 1233, 1234};

        for (int ISBN : listOfISBNs) {
            Optional<Book> value = lib.search(ISBN);

            if(value.isPresent()) {
                System.out.println(value.get());
            } else {
                System.out.println("Book not found.");
            }
        }
    }
}

