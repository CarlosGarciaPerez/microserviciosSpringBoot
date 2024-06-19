package com.uncledavecode.productsservice.model.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long Id;
    private String sku;
    private String name;
    private String description;
    private Double price;
    private Boolean status;


    @Override
    public String toString() {
        return "Product{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
