package by.teachmeskills.entity.transport;

import java.io.Serializable;
import java.util.Objects;

public class Transport {
    private int id;
    private String name;
    private int speed;
    private int capacity;
    private double cargo;
    private TransportType transportType;
    private int price;

    public Transport(int id, String name, int speed, int capacity, double cargo, TransportType transportType, int price) {
        this.id = id;
        this.name = name;
        this.speed = speed;
        this.capacity = capacity;
        this.cargo = cargo;
        this.transportType = transportType;
        this.price = price;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Transport() {
    }

    @Override
    public String toString() {
        return "Транспорт: " +
                " ID: " + id + '|' +
                " название: " + name + '|' +
                " скорость: " + speed + " км/ч" + '|' +
                " вместимость: " + capacity + " чел"  + '|' +
                " грузоподъёмность: " + cargo + " т."  + '|' +
                " тип: " + transportType + '|' +
                " цена за км: " + price + " руб"  +
                '|';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return id == transport.id &&
                speed == transport.speed &&
                capacity == transport.capacity &&
                cargo == transport.cargo &&
                price == transport.price &&
                Objects.equals(name, transport.name) &&
                Objects.equals(transportType, transport.transportType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, speed, capacity, cargo, transportType, price);
    }
}
