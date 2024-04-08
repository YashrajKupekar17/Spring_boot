package com.yashrajproductservice.productservice.controller;

import com.yashrajproductservice.productservice.model.Product;
import com.yashrajproductservice.productservice.service.ProductService;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/products")
public class ProductController{
    private ProductService productService;

    ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        return this.productService.getProductById(id);
    }

    @GetMapping()
    public Product[] getAllProducts(){
        return this.productService.getAllProducts();
    }
    
}
