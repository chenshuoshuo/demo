package com.you07.location.ruijieidata.service;

import com.you07.config.datasource.DataBaseContextHolder;
import com.you07.config.datasource.annotation.DataSourceConnection;
import com.you07.location.ruijieidata.dao.DimRegionDao;
import com.you07.location.ruijieidata.model.DimRegion;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DimRegionService {
    @Autowired
    private DimRegionDao dimRegionDao;

    @DataSourceConnection(DataBaseContextHolder.DataBaseType.MYSQLIDATA)
    public List<DimRegion> findAll(){
        return dimRegionDao.findAll();
    }
    @DataSourceConnection(DataBaseContextHolder.DataBaseType.MYSQLIDATA)
    public String findRegionName(String regionSk){
        String regionName = dimRegionDao.findRegionName(regionSk);
        return regionName;
    }

    public String substr(){

        return null;
    }
}
