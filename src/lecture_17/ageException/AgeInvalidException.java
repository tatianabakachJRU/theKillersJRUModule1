package lecture_17.ageException;

public class AgeInvalidException extends RuntimeException {
    public AgeInvalidException(String message) {
        super(message);
    }
}
