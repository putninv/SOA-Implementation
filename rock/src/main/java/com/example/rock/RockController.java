package com.example.rock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rocks")
public class RockController {

    @Autowired
    private RockService rockService;

    @RequestMapping(value = "/info/{rockId}", method = RequestMethod.GET)
    public void getRockInfo(@PathVariable("rockId") long rockId){
        System.out.println("THIS IS ROCK SERVICE");
        rockService.getRockInfo(rockId);
    }

    @RequestMapping(value = "/info", method = RequestMethod.PUT)
    public long createRockInfo() {
        return rockService.createRockInfo();
    }

    @RequestMapping(value = "/info", method = RequestMethod.POST)
    public void updateRockInfo(@PathVariable("rockId") long rockId) {
        rockService.updateRockInfo(rockId);
    }

    @RequestMapping(value = "/info", method = RequestMethod.DELETE)
    public void deleteRockInfo(@PathVariable("rockId") long rockId){
        rockService.deleteRockInfo(rockId);
    }
}
