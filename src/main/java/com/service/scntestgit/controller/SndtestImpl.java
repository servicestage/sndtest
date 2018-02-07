package com.service.scntestgit.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-02-07T16:23:33.367Z")

@RestSchema(schemaId = "sndtest")
@RequestMapping(path = "/scntestgit", produces = MediaType.APPLICATION_JSON)
public class SndtestImpl {

    @Autowired
    private SndtestDelegate userSndtestDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userSndtestDelegate.helloworld(name);
    }

}
