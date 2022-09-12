package com.nestdigital.nestlogapp.model.dao;

import com.nestdigital.nestlogapp.model.NestLeaveRqstModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NestLEaveRqstDao extends CrudRepository<NestLeaveRqstModel, Integer> {
@Query(value = "INSERT INTO `leave_request`(`dateofleaveapply`, `emp_id`, `leavedate`, `status`) VALUES ('1','2','3','0')",nativeQuery = true)
    List<NestLEaveRqstDao>leaveapply(int id);

}
