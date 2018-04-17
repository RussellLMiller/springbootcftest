package com.example.springbootexample;

public class Workout {
    private final long id;
    private final String workoutName;
    private final String reps;
    private final String exerciseType;

    public Workout(long id, String workoutName, String reps, String exerciseType){
        this.id = id;
        this.workoutName = workoutName;
        this.reps = reps;
        this.exerciseType = exerciseType;
    }

    public long getId(){
        return this.id;
    }

    public String getWorkoutName(){
        return this.workoutName;
    }

    public String getReps(){
        return this.reps;
    }

    public String getExerciseType(){
        return this.exerciseType;
    }

}
