package com.you07.eas.service;

import com.you07.config.datasource.DataBaseContextHolder;
import com.you07.config.datasource.annotation.DataSourceConnection;
import com.you07.eas.dao.AcademyDao;
import com.you07.eas.model.Academy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademyService {
    @Autowired
    private AcademyDao academyDao;

    @DataSourceConnection(DataBaseContextHolder.DataBaseType.MYSQLIDATA)
    public List<Academy> queryAll(){
        return academyDao.queryAll();
    }

    public AcademyDao getAcademyDao() {
        return academyDao;
    }

    public void setAcademyDao(AcademyDao academyDao) {
        this.academyDao = academyDao;
    }
}
