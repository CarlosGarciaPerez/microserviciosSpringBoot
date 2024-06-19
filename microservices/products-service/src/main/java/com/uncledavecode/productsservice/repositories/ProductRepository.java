package com.uncledavecode.productsservice.repositories;

import com.uncledavecode.productsservice.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long >{

}
