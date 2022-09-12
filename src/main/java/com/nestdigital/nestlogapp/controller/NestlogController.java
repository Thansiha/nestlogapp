package com.nestdigital.nestlogapp.controller;

import com.nestdigital.nestlogapp.model.NestModel;
import com.nestdigital.nestlogapp.model.dao.NestlogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NestlogController {
    @Autowired
    NestlogDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping("/addemployee")
    public String addemp (@RequestBody NestModel addemployee){
        dao.save(addemployee);
        return "employees added successfully";}


    @CrossOrigin(origins = "*")
    @GetMapping("/searchemp")
    public List<NestModel>search(){
        return (List<NestModel>)
                dao.findById(id);
    }



}
