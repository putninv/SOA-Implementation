package com.example.messenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
public class MessengerController {

    @Autowired
    private MessengerService messengerService;

    @RequestMapping(value = "/info/{messageId}", method = RequestMethod.GET)
    public void getMessageInfo(@PathVariable("messageId") long messageId){
        messengerService.getMessageInfo(messageId);
    }

    @RequestMapping(value = "/info", method = RequestMethod.PUT)
    public long createMessageInfo() {
        return messengerService.createMessageInfo();
    }

    @RequestMapping(value = "/info", method = RequestMethod.POST)
    public void updateMessageInfo(@PathVariable("messageId") long messageId) {
        messengerService.updateMessageInfo(messageId);
    }

    @RequestMapping(value = "/info", method = RequestMethod.DELETE)
    public void deleteMessageInfo(@PathVariable("messageId") long messageId){
        messengerService.deleteMessageInfo(messageId);
    }
}
