package com.example.demo.api.controller;

import com.example.demo.api.model.Contestant;
import com.example.demo.service.HusbandService;
import netscape.javascript.JSObject;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContestantController {

    private HusbandService service;

    @Autowired
    public ContestantController(HusbandService service){
        this.service = service;
    }
    /* Test Get Request. Retrieve contestant based on name */
    @GetMapping("/user")
    public Contestant getUser(@RequestParam String name){

        return service.getUser(name);
    }

    /* Get Method to recieve all contestants. If I wanted Pairs, I would
    just return an arraylist of pairs in the service*/
    @GetMapping("/contestants")
    public List getAll(){

        return service.getAll();
    }

    /* Get score based on contestant */
    @RequestMapping("/husbandCall/{name}")
    public int getScore(@PathVariable  String name) throws Exception {

        return service.getScore(name);
    }

    /* Post request to create users. Deals with error handling. */
    @RequestMapping(method=RequestMethod.POST, value="/create-contestants")

    public void addContestant(@RequestBody Contestant contestant) throws Exception {
        service.createContest(contestant);

    }





}
