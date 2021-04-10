package com.tmo.servlet.controllers;


import com.tmo.servlet.models.User;
import com.tmo.servlet.repositories.UserRepository;
import com.tmo.servlet.utils.ERest;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/user")
public class UserRestController {

    final UserRepository uRepo;

    public UserRestController(UserRepository uRepo) {
        this.uRepo = uRepo;
    }

    @GetMapping("/list")
    public Map<ERest,Object> GetList(){
     Map<ERest,Object> hm=new LinkedHashMap<>();

     hm.put(ERest.results,uRepo.findAll());

     return  hm;

    }

    @PostMapping("/insert")
    public Map<ERest, Object> insert(@RequestBody User user ) {
        Map<ERest, Object> hm = new LinkedHashMap<>();
        hm.put(ERest.results, uRepo.saveAndFlush(user));
        return hm;
    }




}
