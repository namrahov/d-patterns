package builderp;

public class MainBuilder {
    public static void main(String[] args) {
        Book book = Book.builder()
                .setName("Book 1")
                .build();

        System.out.println(book);
    }
}
