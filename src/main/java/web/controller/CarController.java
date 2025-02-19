package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "count", required = false, defaultValue = "5") int count, Model model) {

        model.addAttribute("cars", carService.findAll(count));
        return "cars";
    }
}

