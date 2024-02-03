package com.a1dnan.customerfrontthymeleafapp.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;
}
