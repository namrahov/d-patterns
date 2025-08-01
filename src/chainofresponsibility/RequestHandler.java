package chainofresponsibility;

public abstract class RequestHandler {
    private RequestHandler nextHandler;

    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request) {
        processRequest(request);
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }

    protected abstract void processRequest(Request request);
}
