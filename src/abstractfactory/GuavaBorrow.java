package abstractfactory;

public class GuavaBorrow implements BorrowService{
    @Override
    public void borrow(int n) {
        System.out.println("Borrowing from Guava" + n);
    }
}
