package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false, defaultValue = "5") int count, Model model) {
        List<Car> carList = createCarList();
        List<Car> selectedCars;

        if (count >= 5) {
            selectedCars = carList;
        } else {
            selectedCars = carList.subList(0, count);
        }

        model.addAttribute("carList", selectedCars);
        return "cars";
    }

    private List<Car> createCarList() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", "Red", 2020));
        carList.add(new Car("BMW", "Black", 2021));
        carList.add(new Car("Mercedes", "Blue", 2019));
        carList.add(new Car("Toyota", "Silver", 2018));
        carList.add(new Car("BMW", "White", 2017));
        return carList;
    }
}