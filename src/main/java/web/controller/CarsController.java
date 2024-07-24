package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/cars")
public class CarsController {

    private CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String getCars(HttpServletRequest request, Model model) {

        if (request.getParameter("count") != null) {

            model.addAttribute(
                    "cars",
                    carService.getCars(
                            Integer.parseInt(
                                    request.getParameter("count"))));

        } else {
            model.addAttribute("cars", carService.getAllCars());
        }

        return "cars";
    }
}
