package com.nandodevs.apilog.controller;

import com.nandodevs.apilog.model.dto.StockDTO;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/stock")
public class StockController {
    
    //Primeiro EndPoint
    @PostMapping
    public ResponseEntity<StockDTO> save(@RequestBody StockDTO dto){
        return null;

    }
}
