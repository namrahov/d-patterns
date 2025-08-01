package abstractfactory;

public class FactoryCreator {

    public static ServiceFactory createServiceFactory(PaymentType type) {
        if (type == PaymentType.APPLE) {
            return new AppleServiceFactoryImpl();
        } else if (type == PaymentType.GUAVA) {
            return new GuavaServiceFactoryImpl();
        }

        return null;
    }
}
