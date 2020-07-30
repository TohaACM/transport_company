package by.teachmeskills.applications.utils;

import by.teachmeskills.applications.actions.*;

import java.util.HashMap;
import java.util.Map;

public class Config {
    public static Map<Integer, Actions> actions =new HashMap<>();
    static {
        actions.put(1, new AddCityAction());
        actions.put(2, new RemoveCityAction());//доработать
        actions.put(3, new SearchCityAction());//доработать
        actions.put(4, new ShowCitiesAction());
        actions.put(5, new AddTransportAction());
        actions.put(6, new ShowTransportAction());
    }
}
//1 - сделать рассчёт растояния(найти как достать долготу и широту и вставить их в формулу)
//2 - сделать расчёт стоимости поездки(найти как достать расстояние и цену за км)
//3 - сделать рассчёт быстроты поездки (найти как достать расстояник и скорость)
//4 - найти способ как достать минимальные значания из 3 и 2.
//5 - найти способ сортировки в зависимости от наличия портов
//4 - сделать выборку взависимости от портов.