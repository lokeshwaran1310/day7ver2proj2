package com.day7proj2.weatherapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class weathercontroller {
    @GetMapping("/weather/today")
    public String todayweather(){
        return "Today's weather: Sunny, 30°C";
    }
    @GetMapping("/weather/tommorow")
    public String tomweather(){
        return "Tomorrow's forecast: Cloudy with rain";
    }
    @GetMapping("/weather/city/{name}")
    public String city(@PathVariable String name){
        return "Weather report for "+name +" is currently unavailable.";
    }
    
}
