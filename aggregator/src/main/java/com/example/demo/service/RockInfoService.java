package com.example.demo.service;

import com.example.demo.RequestBuilderUtil;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.HttpURLConnection;

@Service
public class RockInfoService {

    String rockUrl = "http://localhost:8081/rocks/info/";

    public Object getRockInfo(long rockId) {
        HttpURLConnection con = null;
        try {
            return RequestBuilderUtil.sendGET(rockUrl + rockId);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public long createRockInfo() {
        try {
            RequestBuilderUtil.sendPOST(rockUrl, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0l;
    }

    public void updateRockInfo(long rockId) {
        try {
            RequestBuilderUtil.sendPUT(rockUrl, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteRockInfo(long rockId) {
        try {
            RequestBuilderUtil.sendDELETE(rockUrl);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
