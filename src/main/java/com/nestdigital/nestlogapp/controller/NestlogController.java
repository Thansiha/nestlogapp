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
        return "employees added successfully";
    }


    @CrossOrigin(origins = "*")
    @GetMapping("/searchemp")
    public List<NestModel> search(@RequestBody NestModel searchemp){
        System.out.println(searchemp.getId());
        int id = searchemp.getId();
        return dao.searchById(id);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/edit")
    public List<NestModel> edit(@RequestBody NestModel editemp){
       int id = editemp.getId();
       int empcode = editemp.getEmpcode();
       int mobnum = editemp.getMobilenum();
       String name = editemp.getName();
       String desig = editemp.getName();
       String username = editemp.getUsername();
       String password = editemp.getPassword();
       return dao.updateById(id);
    }
   @CrossOrigin(origins = "*")
   @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        dao.deleteById(id);
        return "deleted successfully";
       }
//    @CrossOrigin(origins = "*")
//    @GetMapping("/viewall")
//    public List <NestModel> viewallemp(){
//        return (List<NestModel>) dao.findAll();}
//
//   }



}
