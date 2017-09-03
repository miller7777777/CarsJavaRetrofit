package mnz.creatori.carsjavaretrofit.Api;


import java.util.List;

import mnz.creatori.carsjavaretrofit.Model.Car;

public class CarsResponse {

    private List<Car> cars;

    public CarsResponse(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }
}
