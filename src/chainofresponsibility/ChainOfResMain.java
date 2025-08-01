package chainofresponsibility;

public class ChainOfResMain {
    public static void main(String[] args) {
        // Set up the chain: Validation -> Logging -> Processing
        RequestHandler validationHandler = new ValidationHandler();
        RequestHandler loggingHandler = new LoggingHandler();
        RequestHandler processingHandler = new ProcessingHandler();

        validationHandler.setNextHandler(loggingHandler);
        loggingHandler.setNextHandler(processingHandler);

        // Test with valid request
        System.out.println("Processing valid request:");
        Request validRequest = new Request("Test Data");
        try {
            validationHandler.handle(validRequest);
            System.out.println("Request processed successfully: " + validRequest.isProcessed());
        } catch (Exception e) {
            System.out.println("Error processing request: " + e.getMessage());
        }

        // Test with invalid request
//        System.out.println("\nProcessing invalid request:");
//        Request invalidRequest = new Request("");
//        try {
//            validationHandler.handle(invalidRequest);
//            System.out.println("Request processed successfully: " + invalidRequest.isProcessed());
//        } catch (Exception e) {
//            System.out.println("Error processing request: " + e.getMessage());
//        }
    }
}
