package com.example.demo.controller;

import com.example.demo.service.MessengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("messenger")
public class MessengerController {
    @Autowired
    private MessengerService messengerService;

    @RequestMapping(value = "/message/{messageId}", method = RequestMethod.GET)
    public Object getMessage(@PathVariable("messageId") long messageId){
        return messengerService.getMessage(messageId);
    }

    @RequestMapping(value = "/message", method = RequestMethod.PUT)
    public long createMessage() {
        return messengerService.createMessage();
    }

    @RequestMapping(value = "/message", method = RequestMethod.POST)
    public void updateMessage(@PathVariable("messageId") long messageId) {
        messengerService.updateMessage(messageId);
    }

    @RequestMapping(value = "/message", method = RequestMethod.DELETE)
    public void deleteMessage(@PathVariable("messageId") long messageId){
        messengerService.deleteMessage(messageId);
    }
}
