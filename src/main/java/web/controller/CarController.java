package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.service.CarService;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "count", required = false, defaultValue = "5") int count, Model model) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car(1, "3-series", "BMW"));
        cars.add(new Car(2, "2-series", "Audi"));
        cars.add(new Car(3, "3-series", "Honda"));
        cars.add(new Car(4, "2-series", "Toyota"));
        cars.add(new Car(5, "3-series", "Suzuki"));

        List<Car> carToDisplay = carService.findAll(cars, count);
        model.addAttribute("cars", carToDisplay);

        return "cars";
    }
}

