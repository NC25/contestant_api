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
    private HashMap<String, Contestant> usersMap;

    public HusbandService(){
        usersMap = new HashMap<String, Contestant>();
    }
    public Contestant getUser(String name){
        return usersMap.get(name);
    }

    public void createContest(Contestant contestant) throws Exception {
        if (contestant.getContestantName() == null || contestant.getHusbandName() == null ||
        contestant.getHusbandLocation() == 0 || contestant.getVocalRange() == 0){
            throw new Exception("Missing Field");
        }
        usersMap.put(contestant.getContestantName(), contestant);
    }

    public List getAll(){
        ArrayList<Contestant> ans = new ArrayList<Contestant>();
        for (String name: usersMap.keySet()){
            ans.add(usersMap.get(name));
        }
        return ans;
    }

    public int getScore(String name) throws Exception {
        Contestant c = usersMap.get(name);
        if (!usersMap.containsKey(name)){
            throw new Exception("Not registered");
        }
        return c.score();
    }
}
