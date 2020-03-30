package com.example.demo.service;

import com.example.demo.RequestBuilderUtil;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.HttpURLConnection;

@Service
public class MessengerService {
    private final static String messageUrl = "http://localhost:8082/message/info/";

    public Object getMessage(long messageId) {
        HttpURLConnection con = null;
        try {
            return RequestBuilderUtil.sendGET(messageUrl + messageId);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public long createMessage() {
        try {
            RequestBuilderUtil.sendPOST(messageUrl, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0l;
    }

    public void updateMessage(long messageId) {
        try {
            RequestBuilderUtil.sendPUT(messageUrl, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteMessage(long messageId) {
        try {
            RequestBuilderUtil.sendDELETE(messageUrl);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
