package abstractfactory;

public class AppleBorrow implements BorrowService {
    @Override
    public void borrow(int n) {
        System.out.println("Borrowing from Apple " + n);
    }
}
