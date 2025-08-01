package chainofresponsibility;

public class ProcessingHandler extends RequestHandler {
    @Override
    protected void processRequest(Request request) {
        System.out.println("ProcessingHandler: Processing request - " + request.getData());
        request.setProcessed(true);
    }
}
