package web.service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    private List<model.Car> carList = new ArrayList<>();

    @Override
    public void add(Car car) {
    }

    @Override
    public List<Car> listUsers() {
        return null;
    }

    @Override
    public int getCarCount() {
        return carList.size();
    }

    @Override
    public List<Car> getCars(int count) {
        return null;
    }
}
