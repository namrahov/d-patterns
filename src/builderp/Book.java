package builderp;

public class Book {
    private String id;
    private String name;
    private String author;
    private String publishDate;
    private String price;

    public Book(String id, String name, String author, String publishDate, String price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishDate = publishDate;
        this.price = price;
    }

    public static BookBuilder builder() {
        return new BookBuilder();
    }

    public static class BookBuilder {
       // static BookBuilder bookBuilder = new BookBuilder();
        private String id;
        private String name;
        private String author;
        private String publishDate;
        private String price;

        public BookBuilder setId(String id)  {
                this.id = id;
                return this;
        }
        public BookBuilder setName(String name)  {
            this.name = name;
            return this;
        }
        public BookBuilder setAuthor(String author)  {
            this.author = author;
            return this;
        }
        public BookBuilder setPublishDAte(String publishDate)  {
            this.publishDate = publishDate;
            return this;
        }
        public BookBuilder setPrice(String price)  {
            this.price = price;
            return this;
        }

        public Book build() {
            return new Book(id,name,author,publishDate,price);
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
