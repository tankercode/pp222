package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService{

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("qwer",1, "q"));
        cars.add(new Car("qwerr",2, "w"));
        cars.add(new Car("qwerrr",3, "e"));
        cars.add(new Car("qwerrrr",4, "r"));
        cars.add(new Car("qwerrrrr",5, "t"));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }


}
