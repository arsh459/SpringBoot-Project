package com.luv2code.springboot.demo.mycoolapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    public TrackCoach() {
        System.out.println("Constructor "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Track Coach";
    }
}
