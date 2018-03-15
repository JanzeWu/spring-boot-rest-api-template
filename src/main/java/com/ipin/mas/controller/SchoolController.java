package com.ipin.mas.controller;

import com.ipin.mas.errorhandler.AppException;
import com.ipin.mas.errorhandler.ParameterMissingException;
import com.ipin.mas.service.SchoolService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by janze on 3/14/18.
 */

@RestController
@RequestMapping("/measure")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;


    @GetMapping("/school")
    public String getSchoolId(@RequestParam String sch_name) throws AppException{

        if(StringUtils.isBlank(sch_name)){
            throw new ParameterMissingException();
        }
        return schoolService.getSchoolId();

    }
}
