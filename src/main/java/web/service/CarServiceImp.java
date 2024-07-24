package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImp implements CarService{

    private CarDao carDao;

    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(int count) {
        // обрабатываем то что достали из базы

        // обрабатываем то что достали из заглушки бд
        return carDao.getCars(count);
    }

    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }


}
