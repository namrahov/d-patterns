package abstractfactory;


public interface ServiceFactory {
    BorrowService createBorrowService();
    PaymentService createPaymentService();
}
