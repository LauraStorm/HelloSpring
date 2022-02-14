package com.example.hellospring.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDate;

@RestController
public class FridayCalculator {

    //1.3 Exercise: ErDetFredag?
    @GetMapping("/erdetfredag")
    public String isItFriday (){
        LocalDate date = LocalDate.now();
        DayOfWeek dayOfWeek = date.getDayOfWeek();      //Finder dags dato

        if (dayOfWeek.equals("FRIDAY")){
            return "Yes - It's Friday";
        }else {
            return "No - it's not Friday";
        }
    }
}
