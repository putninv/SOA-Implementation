package com.example.rock;

import org.springframework.stereotype.Service;

@Service
public class RockService {

    public void getRockInfo(long rockId) {
        System.out.println("Hello");
    }

    public long createRockInfo() {
        System.out.println("Hello");
        return 0l;
    }

    public void updateRockInfo(long rockId) {
        System.out.println("Hello");
    }

    public void deleteRockInfo(long rockId) {
        System.out.println("Hello");
    }

}
