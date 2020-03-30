package com.example.demo.controller;

import com.example.demo.service.RockInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rock")
public class RockController {

    @Autowired
    private RockInfoService rockInfoService;

    @RequestMapping(value = "/info/{rockId}", method = RequestMethod.GET)
    public Object getRockInfo(@PathVariable("rockId") long rockId){
        return rockInfoService.getRockInfo(rockId);
    }

    @RequestMapping(value = "/info", method = RequestMethod.PUT)
    public long createRockInfo() {
        return rockInfoService.createRockInfo();
    }

    @RequestMapping(value = "/info", method = RequestMethod.POST)
    public void updateRockInfo(@PathVariable("rockId") long rockId) {
        rockInfoService.updateRockInfo(rockId);
    }

    @RequestMapping(value = "/info", method = RequestMethod.DELETE)
    public void deleteRockInfo(@PathVariable("rockId") long rockId){
        rockInfoService.deleteRockInfo(rockId);
    }


}
