package homework1;

public class Main {
    public static void main(String[] args) {
        Author stephenKing = new Author("Stephen", "King");
        Book firstBook = new Book("It", stephenKing, 1986);
        System.out.println(firstBook);
        Author stephenieMeyer = new Author("Stephenie", "Meyer");
        Book secondBook = new Book("Twilight", stephenieMeyer, 2005);
        System.out.println(secondBook);
        secondBook.setYearOfPublication(2004);
        System.out.println(secondBook);
    }
}
