package com.example.SelfLearn_Spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Bikini")
@Scope("prototype")
//neu muon moi lan khoi chay la 1 instance moi
public class Bikini implements Outfit{
    @Override
    public void wear(){
        System.out.println("Bikini on!!!");
    }
}
