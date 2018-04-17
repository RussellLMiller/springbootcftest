package com.example.springbootexample;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class WorkoutController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/addWorkout", method = RequestMethod.POST)
    public void addWorkout(@RequestBody String workout){
        System.out.println(workout);
    }

    @RequestMapping(value = "/getWorkout", method = RequestMethod.GET)
    public Workout getWorkout(@RequestParam(value = "id" ) String id ){
        return new Workout(15, "Test Metcon", "12:30", "Metcon");
    }

}
