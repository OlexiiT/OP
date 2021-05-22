package lab_13;

public class FacultyOverflowException extends Exception{
    public FacultyOverflowException() {
        super();
    }
    
    public FacultyOverflowException(String message) {
        super(message);
    }
    
    public FacultyOverflowException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public FacultyOverflowException(Throwable cause) {
        super(cause);
    }
}
