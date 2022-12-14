package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for(Map.Entry<String, Double> temperature :
            temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageTemperatures() {
        double averageDegree = 0.0;

        for(Map.Entry<String, Double> temperature :
            temperatures.getTemperatures().entrySet()) {
            averageDegree += temperature.getValue();
        }
        averageDegree = averageDegree / temperatures.getTemperatures().size();

        return averageDegree;
    }

    public double medianTemperatures() {
        List<Map.Entry<String, Double>> sortList = new ArrayList<>(temperatures.getTemperatures().entrySet());
        sortList.sort(Map.Entry.comparingByValue());

        double medianGrade;

        if(sortList.size() % 2 == 1) {
           medianGrade = sortList.get((sortList.size() + 1) / 2 - 1).getValue();
        } else {
            medianGrade = (sortList.get((sortList.size() -1) / 2).getValue() + sortList.get(sortList.size() / 2).getValue()) / 2;
        }
        return medianGrade;
    }
}
