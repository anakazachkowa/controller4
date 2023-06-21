package web.sevice;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getcarList(Integer count) {
        List<Car> getcarList;
        getcarList = new ArrayList<>();
        getcarList.add(new Car("Volga", "LKH", 1999));
        getcarList.add(new Car("Lada", "NHJ", 2001));
        getcarList.add(new Car("Niva", "KUI", 2005));
        getcarList.add(new Car("Mazda", "MNG", 2022));
        getcarList.add(new Car("Gazal", "NHG", 2007));

        return getcarList.stream().limit(count).collect(Collectors.toList());
    }
}
