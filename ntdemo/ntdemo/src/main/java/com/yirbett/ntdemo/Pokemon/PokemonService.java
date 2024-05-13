package com.yirbett.ntdemo.Pokemon;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService {
    private final String url= "https://pokeapi.co/api/v2/pokemon?limit=10&offset=0.";

    public Object getPokemon(){
        RestTemplate call= new RestTemplate();
        PokemonResponse response= call.getForObject(url, PokemonResponse.class);
        return response.results();
    }
}
