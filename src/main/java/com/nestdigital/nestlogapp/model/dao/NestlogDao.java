package com.nestdigital.nestlogapp.model.dao;

import com.nestdigital.nestlogapp.model.NestModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NestlogDao extends CrudRepository<NestModel, Integer> {
@Query(value = "SELECT `id`, `designation`, `empcode`, `mobilenum`, `name`, `password`, `username` FROM `employees` WHERE 'id'=?1",nativeQuery = true)
    List<NestModel>searchById(int id);
}
