package com.you07.location.ruijieidata.service;

import com.you07.location.ruijieidata.dao.LocationLatestNewDao;
import com.you07.location.ruijieidata.model.LocationLatestNew;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationLatestNewService {
    @Autowired
    private LocationLatestNewDao locationLatestNewDao;
    public List<LocationLatestNew> findAll(){
        return locationLatestNewDao.findAll();
    }
}
