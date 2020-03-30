package com.example.messenger;

import org.springframework.stereotype.Service;

@Service
public class MessengerService {

    public void getMessageInfo(long messageId) {
        System.out.println("getMessageInfo");
    }

    public long createMessageInfo() {
        System.out.println("createMessageInfo");
        return 0l;
    }

    public void updateMessageInfo(long messageId) {
        System.out.println("updateMessageInfo");
    }

    public void deleteMessageInfo(long messageId) {
        System.out.println("deleteMessageInfo");
    }

}
