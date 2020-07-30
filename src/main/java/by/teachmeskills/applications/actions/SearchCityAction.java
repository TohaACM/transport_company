package by.teachmeskills.applications.actions;

import by.teachmeskills.applications.utils.Input;
import by.teachmeskills.entity.Cities;

import java.sql.SQLOutput;
import java.util.List;

public class SearchCityAction extends BaseAction implements Actions {
    @Override
    public String getName() {
        return "Поиск маршрута";
    }

    @Override
    public void action() {
        System.out.println("Список доступных городов:");
        List <Cities> city= citiesController.get();
        for (Cities cities : city){
            System.out.println(cities.getName());
        }
        System.out.println("------------------------------------------------------------");
        String nameDispatch = Input.getString("Введите название города-отправки ");
        citiesController.searchCityOut(nameDispatch);

        String nameArrival = Input.getString("Введите название города-прибытия");
        citiesController.searchCityIn(nameArrival);


    }
}
