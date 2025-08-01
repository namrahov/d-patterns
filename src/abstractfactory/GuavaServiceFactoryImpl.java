package abstractfactory;


public class GuavaServiceFactoryImpl implements ServiceFactory {
    @Override
    public BorrowService createBorrowService() {
       return new GuavaBorrow();
    }

    @Override
    public PaymentService createPaymentService() {
        return new GuavaPay();
    }
}
