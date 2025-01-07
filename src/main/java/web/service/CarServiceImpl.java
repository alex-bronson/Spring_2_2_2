package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars;

     {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", "Green"));
        cars.add(new Car("Ford", "Mustang", "Black"));
        cars.add(new Car("BMW", "X5", "White"));
        cars.add(new Car("Audi", "A4", "Blue"));
        cars.add(new Car("Tesla", "Model 3", "Yellow"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
