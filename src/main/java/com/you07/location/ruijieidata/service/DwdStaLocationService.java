package com.you07.location.ruijieidata.service;

import com.you07.location.ruijieidata.dao.DwdStaLocationDao;
import com.you07.location.ruijieidata.model.DwdStaLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DwdStaLocationService {
    @Autowired
    private DwdStaLocationDao dwdStaLocationDao;
    public List<DwdStaLocation> findAll(){
        return dwdStaLocationDao.findAll();
    }

}
