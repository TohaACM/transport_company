package by.teachmeskills.applications.actions;

import by.teachmeskills.applications.utils.Input;
import by.teachmeskills.controllers.CitiesController;
import by.teachmeskills.controllers.TransportController;
import by.teachmeskills.entity.Cities;
import by.teachmeskills.entity.transport.Transport;
import by.teachmeskills.entity.transport.TransportType;

public abstract class BaseAction implements Actions {
    protected CitiesController citiesController = new CitiesController();

    protected Cities getCity() {
        int id = Input.getInt("ID");
        String name = Input.getString("Название города");
        double longitude = Input.getDouble("Долгота");
        double latitude = Input.getDouble("Широта");
        boolean airport = Input.getBoolean("Наличие аэропорта");
        boolean seaport = Input.getBoolean("Наличие морского порта");
        return new Cities(id, name, longitude, latitude, airport, seaport);
    }

    protected TransportController transportController = new TransportController();

    protected Transport getTransport() {
        int id = Input.getInt("ID");
        String name = Input.getString("Название транспорта");
        int speed = Input.getInt("Скорость");
        int capacity = Input.getInt("Вместимость (чел.)");
        double cargo = Input.getDouble("Грузоподьёмность (т.)");
        TransportType transportType = Input.getType("Выберите тип");
        int price = Input.getInt("Цена за км");
        return new Transport(id, name, speed, capacity, cargo, transportType, price);

    }
}
