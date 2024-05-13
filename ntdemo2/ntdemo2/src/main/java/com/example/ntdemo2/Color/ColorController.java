package com.example.ntdemo2.Color;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path="/api/v1/colors")
public class ColorController {

    @Autowired
    private ColorRepository colService;

    @GetMapping()
    public Flux<Color> getColors(){
        return colService.findAll();
    }

    @PostMapping()
    public Mono<Color> insertColor(@RequestBody Color color){
        return colService.save(color);
    }
}
