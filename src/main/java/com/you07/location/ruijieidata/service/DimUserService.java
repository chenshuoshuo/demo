package com.you07.location.ruijieidata.service;

import com.you07.location.ruijieidata.dao.DimUserDao;
import com.you07.location.ruijieidata.model.DimUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DimUserService {
    @Autowired
    private DimUserDao dimUserDao;

    public List<DimUser> findAll() {
        return dimUserDao.findAll();
    }

    public String findAuthUserId(String userSk) {
        return dimUserDao.findAuthUserId(userSk);
    }

    public String findUserName(String userSk) {
        DimUser userName = dimUserDao.findUserName(userSk);
        String authUserName = userName.getAuthUserName();
        String name = userName.getName();
        if (authUserName != null) {
            return authUserName;
        } else if (name != null) {
            return name;
        } else {
            return null;
        }
    }

    public String findSex(String userSk){
        String sex = dimUserDao.findSex(userSk);
        if (sex == "男") {
            return "1";
        } else if (sex == "女") {
            return "2";
        } else {
            return null;
        }
    }
}
