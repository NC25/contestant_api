package com.example.demo.api.controller;

import com.example.demo.api.model.Contestant;
import com.example.demo.service.HusbandService;
import netscape.javascript.JSObject;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContestantController {

    private HusbandService service;

    @Autowired
    public ContestantController(HusbandService service){
        this.service = service;
    }
    @GetMapping("/name")
    public Contestant getUser(@RequestParam String name){

        return service.getUser(name);
    }

    @RequestMapping(method=RequestMethod.POST, value="/contestants", consumes = {"text/plain;charset=UTF-8"})

    public void addContestant(@RequestBody Contestant contestant){
        service.createContest(contestant);

    }



}
