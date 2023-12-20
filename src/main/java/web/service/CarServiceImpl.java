package web.service;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class CarServiceImpl implements CarService{
    private final List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Scoda Fabia", "Grey", 10000));
        carList.add(new Car("BMW M5", "Black", 30000));
        carList.add(new Car("Toyota Camry", "White", 19000));
        carList.add(new Car("Gazel", "Blue", 1200 ));
        carList.add(new Car("Nissan Terrano", "Green", 8000 ));
    }


    @Override
    public List<Car> getCarByNumber(int count) {
        return IntStream.range(0, carList.size())
                .filter(l -> l < count)
                .mapToObj(carList::get)
                .toList();
    }
}
