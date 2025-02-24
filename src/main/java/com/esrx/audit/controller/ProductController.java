package com.esrx.audit.controller;

import com.esrx.audit.entity.Product;
import com.esrx.audit.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }
    @GetMapping("/id/{id}")
    public Product findById(@PathVariable int id){
        return productService.findById(id);
    }
    @PutMapping("/update/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product product){
       return productService.updateProduct(id,product);
    }
}
