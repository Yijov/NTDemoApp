package com.example.ntdemo2.Color;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ColorService {
    @Autowired
    private final  ColorRepository colorRepo;

    public ColorService(ColorRepository colorRepo) {
        this.colorRepo = colorRepo;
    }

    public Flux<Color> getColors(){
        return colorRepo.findAll();
    }
    public Mono<Color> insertColor(Color color){
        return colorRepo.save(color);
    }

}