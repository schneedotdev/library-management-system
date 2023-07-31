public class Book {
    private final String title;
    private final String author;
    private final int ISBN;

    private Availability availability;

    public Book(String title, String author, int ISBN, Availability availability) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.availability = availability;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getISBN() {
        return ISBN;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book {").append("\n\s\s")
            .append("title: ").append(title).append(",\n\s\s")
            .append("author: ").append(author).append(",\n\s\s")
            .append("ISBN: ").append(ISBN).append(",\n\s\s")
            .append("availability: ").append(availability).append("\n")
            .append('}');
        return sb.toString();
    }
}
