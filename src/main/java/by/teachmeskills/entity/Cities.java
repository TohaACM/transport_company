package by.teachmeskills.entity;

import java.io.Serializable;
import java.util.Objects;

public class Cities implements Serializable {
    private int id;
    private String name;
    private double longitude;
    private double latitude;
    private boolean airport;
    private boolean seaport;

    public Cities(int id, String name, double longitude, double latitude, boolean airport, boolean seaport) {
        this.id = id;
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.airport = airport;
        this.seaport = seaport;
    }

    public Cities(int id) {
    }

    public Cities() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public boolean isAirport() {
        return airport;
    }

    public void setAirport(boolean airport) {
        this.airport = airport;
    }

    public boolean isSeaport() {
        return seaport;
    }

    public void setSeaport(boolean seaport) {
        this.seaport = seaport;
    }

    @Override
    public String toString() {
        return "Города |" +
                "id: " + id +
                " название: " + name + '|' +
                " долгота: " + longitude +'|' +
                " широта: " + latitude +'|' +
                " наличие аэропорта: " + airport +'|' +
                " наличие морского порта:" + seaport +
                '|';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cities cities = (Cities) o;
        return id == cities.id &&
                Double.compare(cities.longitude, longitude) == 0 &&
                Double.compare(cities.latitude, latitude) == 0 &&
                airport == cities.airport &&
                seaport == cities.seaport &&
                Objects.equals(name, cities.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, longitude, latitude, airport, seaport);
    }
}
