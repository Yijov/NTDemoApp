package com.yirbett.ntdemo.Catalog;

import com.yirbett.ntdemo.Pokemon.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1/catalog")
public class CatalogController {
    private final CatalogsService catalogsService;
    @Autowired
    public CatalogController(CatalogsService catalogsService) {
        this.catalogsService = catalogsService;
    }

    @GetMapping()
    public Object getCatalog(){
        return  catalogsService.getCatalogs();
    }
    @GetMapping(path = "/xml")
    public Object getCatalogsXML(){
        return  catalogsService.getCatalogsXML();
    }
}





