package com.bootcamplocator.app.utilities;

import com.bootcamplocator.app.model.Data;

import java.util.ArrayList;

class Utils {
    private static final Utils instance = new Utils();

    static Utils getInstance() {
        return instance;
    }

    private Utils() {
    }

    public ArrayList<Data> getBootCampLocatorWithin10milesofZip(int zipcode){
        ArrayList<Data> list = new ArrayList<>();
        list.add(new Data(30.717f,76.697f,"office","E65, Phase 8, Industrial Area, Phase 8, Industrial Area, Sector 73, Sahibzada Ajit Singh Nagar, Punjab 160071","search"));
        list.add(new Data(30.717f,76.697f,"office","E65, Phase 8, Industrial Area, Phase 8, Industrial Area, Sector 73, Sahibzada Ajit Singh Nagar, Punjab 160071","search"));
        list.add(new Data(30.717f,76.697f,"office","E65, Phase 8, Industrial Area, Phase 8, Industrial Area, Sector 73, Sahibzada Ajit Singh Nagar, Punjab 160071","search"));

        return list;
    }
}
