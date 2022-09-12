package com.nestdigital.nestlogapp.controller;

import com.nestdigital.nestlogapp.model.dao.NestlogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NestlogController {
    @Autowired
    NestlogDao dao;



}
