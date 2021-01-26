package pl.catering.responses;


public class ResponseMessage {
    private String string;

    public ResponseMessage(String string) {
        this.string = string;
    }

    public ResponseMessage() {
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
