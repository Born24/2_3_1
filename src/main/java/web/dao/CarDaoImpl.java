package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> cars = Arrays.asList(
            new Car(1, "3-series", "BMW"),
            new Car(2, "2-series", "Audi"),
            new Car(3, "3-series", "Honda"),
            new Car(4, "2-series", "Toyota"),
            new Car(5, "3-series", "Suzuki")
    );

    @Override
    public List<Car> findAll(int count) {
        int limit = Math.min(count, cars.size());

        return cars.subList(0, limit);
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
