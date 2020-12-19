package com.example.SelfLearn_Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Girl {

    @Autowired
    Outfit outfit;

    public Girl(@Qualifier("Naked") Outfit outfit){
        this.outfit = outfit;
    }

    public Outfit getOutfit() {
        return outfit;
    }

    //@Auto wired: tương tự như auto wired trên line 99
   public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Sau khi khoi tao doi tuong, ham nay se duoc chay dau tien!");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Doi tuong truoc khi bi huy se goi ham nay!");
    }
}
