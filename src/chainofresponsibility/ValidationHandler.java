package chainofresponsibility;

public class ValidationHandler extends RequestHandler {
    @Override
    protected void processRequest(Request request) {
        if (request.getData() == null || request.getData().isEmpty()) {
            throw new IllegalArgumentException("Request data cannot be empty");
        }
        System.out.println("ValidationHandler: Request validated successfully");
    }
}
