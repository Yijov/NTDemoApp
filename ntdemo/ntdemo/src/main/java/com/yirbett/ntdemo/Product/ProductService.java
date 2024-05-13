package com.yirbett.ntdemo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {

    private final ProductRepository productRepo;

    @Autowired
    public ProductService(ProductRepository productRepo) {
        this.productRepo = productRepo;

    }

    public List<Product> getProducts(){
        return productRepo.findAll();
    }


}
