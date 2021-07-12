package web;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsBD {

    public static List<Car> getBD () {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car("Skoda", "Octavia A5", "turbo 1.8");
        Car car2 = new Car("Opel", "Omega B", "MV6 3.0");
        Car car3 = new Car("Volkswagen", "Passat b5+", "turbo 1.8");
        Car car4 = new Car("Lada", "2105", "atmo 1.5");
        Car car5 = new Car("Toyota", "Celica T23", "atmo 1.8");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        return cars;
    }

}
