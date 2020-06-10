package com.project.dixml;

import java.util.List;

public class Parcare {

    private List<Car> carInParking;

    public Parcare(List<Car> carInParking) {
        this.carInParking = carInParking;
    }

    @Override
    public String toString() {
        return "Parcare{" +
                "carInParking=" + carInParking +
                '}';
    }
}
