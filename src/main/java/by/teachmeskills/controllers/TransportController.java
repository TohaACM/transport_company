package by.teachmeskills.controllers;

import by.teachmeskills.dao.TransportDao;
import by.teachmeskills.entity.transport.Transport;

import java.util.List;

public class TransportController {
    private TransportDao transportDao = new TransportDao ();

    public void add (Transport transport){
        transportDao.add(transport);
    }
    public List<Transport> get (){
        return transportDao.get();
    }
}
