package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao {
    // логика взаимодействия с бд

    // заглушка для таски 222
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
