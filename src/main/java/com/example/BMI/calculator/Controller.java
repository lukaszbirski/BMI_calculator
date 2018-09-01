package com.example.BMI.calculator;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {


    @GetMapping("/")
    public String hello(){
        return "index";
    }

    @GetMapping("/bmi_calculator")
    public String bmi_calculator(){
        return "bmi_calculator";
    }

    @GetMapping("/calories_calculator")
    public String calories_calculator(){
        return "calories_calculator";
    }

    @GetMapping("/bmi_show")
    public String show(@RequestParam int height, @RequestParam int weight, ModelMap map){
        Bmi bmi = new Bmi(height, weight);
        map.put("bmi", bmi);
        return "bmi_show";
    }

    @GetMapping("/calories_show")
    public String calories_show(@RequestParam int height, @RequestParam int weight, @RequestParam String gender, @RequestParam int age, @RequestParam double value, ModelMap map){
        Calories calories = new Calories(age, height, weight, gender, value);
        map.put("calories", calories);
        return "calories_show";
    }
}
