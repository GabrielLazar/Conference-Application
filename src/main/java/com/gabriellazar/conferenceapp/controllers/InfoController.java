package com.gabriellazar.conferenceapp.controllers;

import com.gabriellazar.conferenceapp.models.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private Info info;

    @GetMapping()
    public ResponseEntity<Info> getInfo(){
        return ResponseEntity.status(HttpStatus.OK).body(info);
    }


}