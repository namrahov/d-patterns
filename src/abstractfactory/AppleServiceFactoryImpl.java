package abstractfactory;

public class AppleServiceFactoryImpl implements ServiceFactory{
    @Override
    public BorrowService createBorrowService() {
        return new AppleBorrow();
    }

    @Override
    public PaymentService createPaymentService() {
        return new ApplePay();
    }
}
