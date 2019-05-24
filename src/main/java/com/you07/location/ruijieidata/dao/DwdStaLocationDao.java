package com.you07.location.ruijieidata.dao;

import com.you07.common.BaseDao;
import com.you07.location.ruijieidata.model.DwdStaLocation;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DwdStaLocationDao extends BaseDao<DwdStaLocation> {
    @Select({
            "Select * from DWD_STA_LOCATION_2019051809"
    })
    List<DwdStaLocation> findAll();

}
