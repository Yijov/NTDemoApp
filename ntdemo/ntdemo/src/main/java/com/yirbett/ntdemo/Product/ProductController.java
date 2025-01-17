package com.yirbett.ntdemo.Product;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping(path="/api/v1/products")
public class ProductController {
    private final ProductService prodService;

    @Autowired
    public ProductController(ProductService prodService) {
        this.prodService = prodService;
    }

    @GetMapping()
    public List<Product> getProducts(){
        return prodService.getProducts();
    }


}
