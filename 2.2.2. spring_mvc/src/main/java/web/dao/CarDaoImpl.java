package web.dao;

import org.springframework.stereotype.Repository;
import web.CarsBD;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{

    @Override
    public List<Car> getSomeCars(int count) {
        return CarsBD.getBD().stream().limit(count).collect(Collectors.toList());
    }
}
