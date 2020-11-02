package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private List<Car> cars;


    public CarDAO() {
        cars = new ArrayList<>();

        cars.add(new Car("Moskvich", "Red"));
        cars.add(new Car("Lada sedan", "Baklazhan"));
        cars.add(new Car("Devyatka", "Chery"));
        cars.add(new Car("Zaporozhec", "Grasshopper"));
        cars.add(new Car("Eva 00", "Bloody"));
    }


    public void save (Car car) {
        cars.add(car);
    }

    public List<Car> getAll() {
        return cars;
    }

    public List<Car> getSome (int count) {
        List<Car> result = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            result.add(cars.get(i));
        }
        return result;
    }

    public Car show(int id) {
        return cars.stream().filter(perosn -> perosn.getId() == id).findAny().orElse(null);
    }

}
