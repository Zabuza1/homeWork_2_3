package com.example.homeWork_2_3;

import org.springframework.stereotype.Service;

@Service
    public class CalculatorService implements CalculatorInterface {

    public String greetings(){
        return "Welcome to the calculator";
    }

    public float plus(float a, float b){
        return a+b;
    }
    public float minus(float a, float b){
        return a-b;
    }
    public float multiply(float a, float b){
        return a*b;
    }
    public float divide(float a, float b){
        return a/b;
    }

}
