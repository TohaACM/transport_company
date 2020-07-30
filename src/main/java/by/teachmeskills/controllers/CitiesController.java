package by.teachmeskills.controllers;

import by.teachmeskills.dao.CitiesDao;
import by.teachmeskills.entity.Cities;
import by.teachmeskills.exceptions.DuplicateCityException;

import java.util.List;

public class CitiesController {
    private CitiesDao citiesDao = new CitiesDao();

    public void add(Cities cities) throws DuplicateCityException {
        citiesDao.add(cities);
    }

    public List<Cities> get() {
        return citiesDao.get();
    }

    public void remove(int id) {
        citiesDao.remove(new Cities(id));
    }

    public void searchCityOut(String cities) {
        citiesDao.searchCityOut(cities);

    }

    public void searchCityIn(String cities) {
        citiesDao.searchCityIn(cities);

    }
}
