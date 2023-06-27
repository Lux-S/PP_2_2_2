package web.service;

import java.util.List;

public interface CarService {
    void add(model.Car car);
    List<model.Car> listUsers();
    int getCarCount();
    List<model.Car> getCars(int count);
}