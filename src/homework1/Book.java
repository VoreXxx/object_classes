package homework1;

public class Book {
    private final String titleBook;
    private final Author author;
    private int yearOfPublication;
    public Book(String titleBook, Author author, int yearOfPublication) {
        this.titleBook = titleBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }
    public String getTitleBook() {
        return titleBook;
    }
    public Author getAuthor() {
        return author;
    }
    public int getYearOfPublication() {
        return yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
