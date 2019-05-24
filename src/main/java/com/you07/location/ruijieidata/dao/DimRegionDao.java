package com.you07.location.ruijieidata.dao;

import com.you07.common.BaseDao;
import com.you07.location.h3cup.model.H3cUpAp;
import com.you07.location.ruijieidata.model.DimRegion;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DimRegionDao extends BaseDao<DimRegion> {
    @Select({
            "Select * from dim_region"
    })
    List<DimRegion> findAll();
    /*通过传入DWD_STA_LOCATION的user_sk值询auth_user_id表中的sex*/
    @Select({
            "Select region_name from dim_region where region_sk=#{regionSk}"
    })
    String findRegionName(@Param("regionSk") String regionSk);
}
