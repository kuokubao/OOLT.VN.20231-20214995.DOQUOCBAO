package Exception;

public class DuplicatedItemException extends Exception {

    public DuplicatedItemException() {
        // Constructor mặc định không có thông điệp
    }

    public DuplicatedItemException(String message) {
        super(message);
        // Constructor với thông điệp được truyền vào
    }

    public DuplicatedItemException(Throwable cause) {
        super(cause);
        // Constructor với nguyên nhân gây ra ngoại lệ
    }

    public DuplicatedItemException(String message, Throwable cause) {
        super(message, cause);
        // Constructor với thông điệp và nguyên nhân gây ra ngoại lệ
    }

    public DuplicatedItemException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        // Constructor với thông điệp, nguyên nhân, và tùy chọn để vô hiệu hóa hoặc ghi thông báo stack trace
    }
}
