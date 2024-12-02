package com.luv2code.springboot.demo.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("Constructor "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Fast bowling for 15 minutes";
    }
}
