package org.madushan.demo.services;


import org.madushan.demo.domain.Product;

import java.util.List;

public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);
}
