package com.luv2code.springboot.demo.mycoolapp.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    public BaseballCoach() {
        System.out.println("Constructor "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Base ball Coach";
    }
}
