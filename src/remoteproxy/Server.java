package remoteproxy;


import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            // Nesneyi oluştur
            HelloImpl obj = new HelloImpl();

            // Registry oluştur (port 1099 varsayılan)
            Registry registry = LocateRegistry.createRegistry(1099);

            // Nesneyi registry'ye bağla
            registry.bind("HelloService", obj);

            System.out.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
