package com.you07.location.ruijieidata.dao;

import com.you07.common.BaseDao;
import com.you07.location.ruijieidata.model.DimRegion;
import com.you07.location.ruijieidata.model.DimUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DimUserDao extends BaseDao<DimUser> {
    @Select({
            "Select * from dim_user"
    })
    List<DimUser> findAll();
    /*通过传入DWD_STA_LOCATION的user_sk值询auth_user_id表中的auth_user_id*/
    @Select({
            "Select auth_user_id from dim_user where user_sk=#{userSk}"
    })
    String  findAuthUserId(@Param("userSk") String userSk);
    /*通过传入DWD_STA_LOCATION的user_sk值询auth_user_id表中的auth_user_name name*/
    @Select({
            "Select auth_user_name,name from dim_user where user_sk=#{userSk}"
    })
    DimUser findUserName(@Param("userSk") String userSk);
    /*通过传入DWD_STA_LOCATION的user_sk值询auth_user_id表中的sex*/
    @Select({
            "Select sex dim_user from where user_sk=#{userSk}"
    })
    String findSex(@Param("userSk") String userSk);
}
