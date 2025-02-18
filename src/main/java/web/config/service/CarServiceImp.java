package web.config.service;

import org.springframework.stereotype.Service;
import web.config.dao.CarDaoImp;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final CarDaoImp carDaoImp;

    public CarServiceImp(CarDaoImp carDaoImp) {
        this.carDaoImp = carDaoImp;
    }

    @Override
    public List<Car> findAll(List<Car> cars, int count) {

        if (cars == null || cars.isEmpty()) {
            return List.of();
        }

        return carDaoImp.findAll(cars, count);
    }
}
