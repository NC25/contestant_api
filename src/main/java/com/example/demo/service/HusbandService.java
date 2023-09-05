package com.example.demo.service;

import com.example.demo.api.model.Contestant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class HusbandService
{
    //private HashMap<String, Contestant> usersMap;
    private ArrayList<Contestant> usersMap;

    public HusbandService(){
        usersMap = new ArrayList<Contestant>();
    }
    public Contestant getUser(String name){
        for (Contestant contestant: usersMap){
            if (name == contestant.getHusbandName()){
                return contestant;
            }
        }
        return null;
    }

    public void createContest(Contestant contestant){
        usersMap.add(contestant);
    }


}
