package web.config.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    @Override
    public List<Car> findAll(List<Car> cars, int count) {
        int limit = Math.min(count, cars.size());
        return cars.subList(0, limit);
    }
}
