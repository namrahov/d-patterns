package iterator;

public class BookCollection implements IterableCollection<Book> {
    private Book[] books;
    private int size;

    public BookCollection(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public void addBook(Book book) {
        if (size < books.length) {
            books[size++] = book;
        }
    }

    @Override
    public Iterator<Book> createIterator() {
        return new BookIterator();
    }

    private class BookIterator implements Iterator<Book> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size && books[currentIndex] != null;
        }

        @Override
        public Book next() {
            return books[currentIndex++];
        }
    }

}
