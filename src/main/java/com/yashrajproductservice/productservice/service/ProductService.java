package com.yashrajproductservice.productservice.service;

import com.yashrajproductservice.productservice.model.Product;

public interface ProductService {
    public Product getProductById(Long id);

    public Product[] getAllProducts();
    
}
