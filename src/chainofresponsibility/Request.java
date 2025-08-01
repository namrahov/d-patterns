package chainofresponsibility;

public class Request {
    private String data;
    private boolean processed;

    public Request(String data) {
        this.data = data;
        this.processed = false;
    }

    public String getData() {
        return data;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }
}
