package by.teachmeskills.exceptions;

public class DuplicateTransportException extends Exception{
    private int id;

    public DuplicateTransportException (int id){this.id = id;
    }

    @Override
    public String getMessage() {
        return "Транспорт с id = " + id + " уже существует";
    }
}
