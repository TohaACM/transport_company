package by.teachmeskills.applications.actions;

import by.teachmeskills.entity.Cities;
import by.teachmeskills.entity.transport.Transport;
import by.teachmeskills.exceptions.StopApplicationException;

import java.util.List;

public class ShowTransportAction extends BaseAction implements Actions{
    @Override
    public String getName() {
        return "Доступный транспорт";
    }

    @Override
    public void action() throws StopApplicationException {
        List <Transport> transports = transportController.get();
        System.out.println("------------------------------------------------------------");
        for (Transport transport: transports){
            System.out.println(transport);
        }
        System.out.println("------------------------------------------------------------");
    }
}
