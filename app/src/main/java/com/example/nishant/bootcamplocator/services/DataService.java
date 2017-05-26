package com.example.nishant.bootcamplocator.services;

import com.example.nishant.bootcamplocator.model.Devslopes;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by nishant on 5/22/17.
 */

 public class DataService {
    private static final DataService instance = new DataService();

    public  static DataService getInstance() {
        return instance;
    }

    private DataService() {


    }

    public ArrayList<Devslopes> getBootcampLocationWithin10MiesofZip(int zipcode)
    {

        //pretending data from net

        ArrayList<Devslopes> list = new ArrayList<>();
        list.add(new Devslopes(32.986849f,-96.767109f,"Downtown", "17360 Coit Rd, Dallas, TX 75252", "slo"));
        list.add(new Devslopes(32.993883f,-96.771593f,"yo","7706 Osage Plaza Pkwy, Dallas, TX 75252","slo"));
        list.add(new Devslopes(33.031305f,-96.770655f,"too","7706 Osage Plaza Pkwy22, Dallas, TX 75252", "slo"));

        return  list;
    }
}
