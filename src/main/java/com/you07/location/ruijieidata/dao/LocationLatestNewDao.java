package com.you07.location.ruijieidata.dao;

import com.you07.common.BaseDao;
import com.you07.location.ruijieidata.model.LocationLatestNew;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LocationLatestNewDao extends BaseDao<LocationLatestNew> {
    @Select({
            "Select * from location_latest"
    })
    List<LocationLatestNew> findAll();
}
