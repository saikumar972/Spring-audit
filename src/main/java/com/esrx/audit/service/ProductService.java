package com.esrx.audit.service;

import com.esrx.audit.entity.Product;
import com.esrx.audit.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

    public Product saveProduct( Product product){
        return repo.save(product);
    }

    public Product findById(int id){
        return repo.findById(id).get();
    }

    public Product updateProduct(int id, Product product){
        Product existingProduct=findById(id);
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        repo.save(existingProduct);
        return existingProduct;
    }
}
