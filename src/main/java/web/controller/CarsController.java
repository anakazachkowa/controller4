package web.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.sevice.CarServiceImpl;

import java.util.List;

@Controller
@Component
public class CarsController {

    private CarServiceImpl carServiceImpl;

    public CarsController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "5") Integer count, ModelMap model) {
//        CarServiceImpl carsServiceImpl = new CarServiceImpl();
        List<Car> qtyCars = carServiceImpl.carList(count);
        model.addAttribute("cars", qtyCars);
        return "cars";
    }
}
