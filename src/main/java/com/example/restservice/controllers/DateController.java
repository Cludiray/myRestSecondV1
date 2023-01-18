package com.example.restservice.controllers;

import com.example.restservice.service.DateService;
import com.example.restservice.model.MyDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateController {

    private final DateService dateService;

    @Autowired
    public DateController(DateService dateService){
        this.dateService = dateService;
    }

    @GetMapping(value = "/date")
    public ResponseEntity<MyDate> read() {
        MyDate myDate = dateService.read();
        return new ResponseEntity<>(myDate, HttpStatus.OK);
    }

}
