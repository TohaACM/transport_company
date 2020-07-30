package by.teachmeskills.applications.actions;

import by.teachmeskills.entity.Cities;
import by.teachmeskills.exceptions.DuplicateCityException;
import by.teachmeskills.exceptions.StopApplicationException;

public class AddCityAction extends BaseAction implements Actions{

    @Override
    public String getName() {
        return "Добавить город";
    }

    @Override
    public void action() {
        Cities cities = getCity();
        try {
            citiesController.add(cities);
        } catch (DuplicateCityException e) {
            System.out.println(e.getMessage());
        }

    }
}
