package com.nestdigital.nestlogapp.controller;

import com.nestdigital.nestlogapp.model.NestLeaveRqstModel;
import com.nestdigital.nestlogapp.model.dao.NestLEaveRqstDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NestLeaveRqstController {
    @Autowired
    NestLEaveRqstDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping("/leaveapply")
    public String leave (@RequestBody NestLeaveRqstModel leaveobj){
        int emp_id =leaveobj.getEmp_id();
        int dateofleaveapply = leaveobj.getDateofleaveapply();
        int leavetakendate = leaveobj.getLeavedate();
        return "leave application processing";

    }
//    @CrossOrigin(origins = "*")
//    @PostMapping("/leavestatus")
//    public List<NestLeaveRqstModel> status(@RequestBody NestLeaveRqstModel leavestatus){
//        return "status shows";
//
//    }


}
