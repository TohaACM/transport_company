package by.teachmeskills.applications.actions;

import by.teachmeskills.exceptions.StopApplicationException;

public interface Actions {
    String getName();
    void action () throws StopApplicationException;

}
