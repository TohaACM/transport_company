package by.teachmeskills.applications.actions;

import by.teachmeskills.entity.Cities;
import by.teachmeskills.exceptions.StopApplicationException;

import java.util.List;

public class ShowCitiesAction extends BaseAction implements Actions{

    @Override
    public String getName() {
        return "Доступные города";
    }

    @Override
    public void action() throws StopApplicationException {
        List <Cities> city= citiesController.get();
        System.out.println("------------------------------------------------------------");
        for (Cities cities : city){
            System.out.println(cities);
        }
        System.out.println("------------------------------------------------------------");
    }
}
