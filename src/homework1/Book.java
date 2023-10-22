package homework1;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(titleBook, book.titleBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleBook, author, yearOfPublication);
    }

    @Override
    public String toString() {
        return "Book: " + titleBook + ", author: " + author + ", year of publication: " + yearOfPublication;
    }
}
