package by.teachmeskills.applications.actions;

import by.teachmeskills.entity.transport.Transport;
import by.teachmeskills.exceptions.DuplicateCityException;
import by.teachmeskills.exceptions.DuplicateTransportException;
import by.teachmeskills.exceptions.StopApplicationException;

public class AddTransportAction extends BaseAction implements Actions {
    @Override
    public String getName() {
        return "Добавить транспорт";
    }

    @Override
    public void action() throws StopApplicationException {
        Transport transport = getTransport();
        transportController.add(transport);

    }
}
