package abstractfactory;

public class MainFactory {

    public static void main(String[] args) {

        ServiceFactory serviceFactory = FactoryCreator.createServiceFactory(PaymentType.GUAVA);
        BorrowService borrowService = serviceFactory.createBorrowService();
        PaymentService paymentService = serviceFactory.createPaymentService();

        borrowService.borrow(10);
        paymentService.pay();


    }
}
