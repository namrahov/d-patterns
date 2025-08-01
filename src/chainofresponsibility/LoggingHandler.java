package chainofresponsibility;

public class LoggingHandler extends RequestHandler {
    @Override
    protected void processRequest(Request request) {
        System.out.println("LoggingHandler: Logging request data - " + request.getData());
    }
}