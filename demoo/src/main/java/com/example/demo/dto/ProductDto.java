package com.example.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter
@NoArgsConstructor
public class ProductDto {
    private String title;

    private String content;

    private int count;

    private int price;

    public ProductDto(String title, String content, int count, int price)
    {
        this.title = title;
        this.content = content;
        this.count = count;
        this.price = price;
    }
}
