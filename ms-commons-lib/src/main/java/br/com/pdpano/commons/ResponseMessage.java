package br.com.pdpano.commons;

public class ResponseMessage<T> {
    private final Boolean success;
    private final T result;

    public ResponseMessage(Boolean success, T result) {
        this.success = success;
        this.result = result;
    }

    public static <T> ResponseMessage<T> build(T result) {
        return new ResponseMessage<>(true, result);
    }

    public Boolean getSuccess() {
        return success;
    }

    public T getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "ResponseMessage{" +
                "success=" + success +
                ", result=" + result +
                '}';
    }
}