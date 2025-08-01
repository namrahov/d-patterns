package iterator;

public class IteratorPatternMain {

    public static void main(String[] args) {

        BookCollection collection = new BookCollection(3);
        collection.addBook(new Book("The Great Gatsby"));
        collection.addBook(new Book("1984"));
        collection.addBook(new Book("To Kill a Mockingbird"));

        Iterator<Book> iterator = collection.createIterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Book: " + book.getTitle());
        }

    }

}
