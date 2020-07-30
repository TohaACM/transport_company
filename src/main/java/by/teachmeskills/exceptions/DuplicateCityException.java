package by.teachmeskills.exceptions;

public class DuplicateCityException extends Exception{
    private int id;

    public DuplicateCityException (int id){this.id = id;
    }

    @Override
    public String getMessage() {
        return "Город с id = " + id + " уже существует";
    }
}
