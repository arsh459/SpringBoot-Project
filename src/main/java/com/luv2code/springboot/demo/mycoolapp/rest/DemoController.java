package com.luv2code.springboot.demo.mycoolapp.rest;

import com.luv2code.springboot.demo.mycoolapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private final Coach myCoach;
    private final Coach anotherCoach;


    @Autowired
    public DemoController(@Qualifier("tenisCoach") Coach theCoach,@Qualifier("tenisCoach") Coach theCoach1){
        System.out.println("Constructor"+getClass().getSimpleName());
        myCoach= theCoach;
        anotherCoach =theCoach1;
    }

    @GetMapping("/check")
    public String checkBeanScopes() {
        return "Comparing: " + (myCoach==anotherCoach);

    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout() + anotherCoach.getDailyWorkout();
    }
}
