package com.example.restservice.service;

import com.example.restservice.model.MyDate;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

@Service
public class DateService {

    private Date date;
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");

    public MyDate read(){

        date = new Date();
        MyDate myDate = new MyDate();

        StringTokenizer st = new StringTokenizer(simpleDateFormat.format(date),".");

        myDate.setDay(Integer.parseInt(st.nextToken()));
        myDate.setMonth(Integer.parseInt(st.nextToken()));
        myDate.setYear(Integer.parseInt(st.nextToken()));

        //System.out.println("GET REQUEST IS WORKED");

        return myDate;
    }

}
