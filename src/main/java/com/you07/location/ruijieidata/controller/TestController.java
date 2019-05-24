package com.you07.location.ruijieidata.controller;

import com.you07.eas.model.StudentInfo;
import com.you07.eas.service.StudentInfoService;
import com.you07.location.ruijieidata.model.DimRegion;
import com.you07.location.ruijieidata.service.DimRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private DimRegionService dimRegionService;
    @Autowired
    private StudentInfoService studentInfoService;

    @GetMapping("/v1")
    public List<DimRegion> get(){
        List<DimRegion> all = dimRegionService.findAll();
        return all;
    }

    @GetMapping("/v2")
    public List<StudentInfo> v2(){
        List<StudentInfo> all = studentInfoService.listAll();
        return all;
    }

}
