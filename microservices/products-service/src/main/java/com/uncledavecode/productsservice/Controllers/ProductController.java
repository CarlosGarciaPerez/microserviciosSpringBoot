package com.uncledavecode.productsservice.Controllers;

import com.uncledavecode.productsservice.model.dtos.ProductRequest;
import com.uncledavecode.productsservice.model.dtos.ProductResponse;
import com.uncledavecode.productsservice.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduct (@RequestBody ProductRequest productRequest){
        this.productService.addProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
        return  this.productService.getAllProducts();
    }
}
