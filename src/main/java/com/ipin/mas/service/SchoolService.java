package com.ipin.mas.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


/**
 * Created by janze on 3/14/18.
 */

@Service
public class SchoolService {


    @Value("${school_id}")
    private String schoolId;

    public String getSchoolId(){

        return schoolId;
    }

}
