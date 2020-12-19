package com.example.SelfLearn_Spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Naked")
@Primary
//Qualified co do uu tien cao hon primary
public class Naked implements Outfit{
    @Override
    public void wear(){
        System.out.println("Naked !!!");
    }
}
