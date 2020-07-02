package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Override
    public List<Car> listCars() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota", "Corolla", 10000));
        cars.add(new Car("Lada", "Vesta", 13000));
        cars.add(new Car("Mitsubishi", "Pajero", 18000));
        return cars;
    }
}
