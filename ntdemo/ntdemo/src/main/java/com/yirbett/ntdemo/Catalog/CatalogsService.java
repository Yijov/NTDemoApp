package com.yirbett.ntdemo.Catalog;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CatalogsService {

    private final String url= "https://mocktarget.apigee.net/xml";

    public Object getCatalogs(){
        RestTemplate call= new RestTemplate();
        CatalogResponse response= call.getForObject(url, CatalogResponse.class);
        return response;
    }

    public Object getCatalogsXML(){
        RestTemplate call= new RestTemplate();
        String response= call.getForObject(url, String.class);
        return response;
    }
}
