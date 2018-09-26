package com.you07.vtpl.service;

import com.you07.eas.dao.StudentInfoDao;
import com.you07.eas.dao.TeacherInfoDao;
import com.you07.eas.model.StudentInfo;
import com.you07.eas.model.TeacherInfo;
import com.you07.eas.service.StudentInfoService;
import com.you07.eas.service.TeacherInfoService;
import com.you07.vtpl.dao.LocationLatestDao;
import com.you07.vtpl.model.LocationLatest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class LocationLatestService {
    @Autowired
    private StudentInfoService studentInfoService;
    @Autowired
    private TeacherInfoService teacherInfoService;
    @Autowired
    private LocationLatestDao locationLatestDao;

    public void saveUser(String sAccout, String sMac, String mode){
        StudentInfo stu = studentInfoService.get(sAccout);
        TeacherInfo tea = teacherInfoService.get(sAccout);
        LocationLatest ll = locationLatestDao.selectByPrimaryKey(sAccout);

        locationLatestDao.invalidMac(sMac, sAccout);

        if(ll == null){
            String realname, gender, orgCode, orgName;
            realname = gender = orgCode = orgName = "";
            if(stu != null || tea != null) {
                if (stu != null) {
                    realname = stu.getName();
                    gender = stu.getGender();
                    orgCode = stu.getClassInfo().getClasscode();
                    orgName = stu.getClassInfo().getClassname();
                }

                if (tea != null) {
                    realname = tea.getName();
                    gender = tea.getGender();
                    orgCode = tea.getDepartmentInfo().getXsbmdm();
                    orgName = tea.getDepartmentInfo().getXsbmmc();
                }

                ll = new LocationLatest();

                ll.setUserid(sAccout);
                ll.setGender(gender);
                ll.setRealname(realname);
                ll.setOrgCode(orgCode);
                ll.setOrgName(orgName);
                ll.setAccountMac(sMac);
                ll.setLocationMode(mode);
                ll.setUsrUpdateTime(new Date());
                locationLatestDao.insertSelective(ll);
            }
        } else{
            ll.setAccountMac(sMac);
            ll.setLocationMode(mode);
            ll.setUsrUpdateTime(new Date());
            locationLatestDao.updateByPrimaryKeySelective(ll);
        }
    }

    public int update(LocationLatest locationLatest){
        return locationLatestDao.updateByPrimaryKeySelective(locationLatest);
    }



    public LocationLatest loadByAccountMac(String accountMac){
        return locationLatestDao.loadByAccountMac(accountMac);
    }
}