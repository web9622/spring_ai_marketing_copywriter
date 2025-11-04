package com.spring_ai_hanbit.openai.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductInfo {
    private String name;
    private Integer price;
    private String link;
    private String features;
}
