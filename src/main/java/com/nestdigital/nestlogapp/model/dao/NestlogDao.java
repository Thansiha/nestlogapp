package com.nestdigital.nestlogapp.model.dao;

import com.nestdigital.nestlogapp.model.NestModel;
import org.springframework.data.repository.CrudRepository;

public interface NestlogDao extends CrudRepository<NestModel, Integer> {
}
