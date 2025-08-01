package remoteproxy;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            // Uzak registry'ye bağlan (localhost ve port 1099)
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Uzak nesneyi lookup et (bu, otomatik olarak bir stub/proxy döndürür)
            Hello stub = (Hello) registry.lookup("HelloService");

            // Uzak metodu çağır
            String response = stub.sayHello();
            System.out.println("Response: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
