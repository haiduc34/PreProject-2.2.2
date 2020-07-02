package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@RequestMapping ("cars")
@Controller
public class CarController {

    @Autowired
    private CarService carService;
    private final String EN = "CARS";
    private final String RU = "МАШИНЫ";

    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String listCars(ModelMap model, @RequestParam("locale") String locale) {
        List<Car> cars = this.carService.listCars();
        if (locale.equals("en")) {
            model.addAttribute("tableHeader", EN);

        } else {
            model.addAttribute("tableHeader", RU);
        }

        model.addAttribute("cars", cars);



        return "cars";
    }
}


