
public class  BirthDateException extends Exception {
    public BirthDateException() {
        super("Date of birth must be a date and equals to or more than 15 years old!");
    }
}