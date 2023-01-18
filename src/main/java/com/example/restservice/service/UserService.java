package com.example.restservice.service;


import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service
public class UserService {

    private final Map<String,String> account = new HashMap<>();
    public void create(String userName, String password){
        account.put(userName,password);
        //System.out.println("POST REQUEST IS WORKED");
    }

}
