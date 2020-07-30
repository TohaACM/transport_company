package by.teachmeskills.entity.transport;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TransportType {
    private int id;
    private String typename;
    private List<Transport> transports;

    public TransportType(int id, String typename, List<Transport> transports) {
        this.id = id;
        this.typename = typename;
        this.transports = transports;
    }

    public TransportType(String typename) {
        this.typename = typename;
        this.transports = new ArrayList<>();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TransportType(){
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public List<Transport> getTransports() {
        return transports;
    }

    public void setTransports(List<Transport> transports) {
        this.transports = transports;
    }

    @Override
    public String toString() {
        return typename;

    }
}
