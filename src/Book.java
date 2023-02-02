public class Book {
    private  final String title;
    private final Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    public String getTitle() {
        return this.title;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    @Override
    public String toString() {
        return this.title + " " + this.author + " " + this.publicationYear;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book d = (Book) other;
        return title.equals(d.title) && author.equals(d.author) && publicationYear == d.publicationYear;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(title) + java.util.Objects.hash(author) + java.util.Objects.hash(publicationYear);
    }
}
