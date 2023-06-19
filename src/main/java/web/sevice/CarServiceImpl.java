package web.sevice;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList;
        {
            carList = new ArrayList<>();
            carList.add(new Car("Volga", "LKH", 1999));
            carList.add(new Car("Lada", "NHJ", 2001));
            carList.add(new Car("Niva", "KUI", 2005));
            carList.add(new Car("Mazda", "MNG", 2022));
            carList.add(new Car("Gazal", "NHG", 2007));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
