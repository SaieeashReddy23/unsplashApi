package com.saieeash.unsplashApi.model;


import lombok.*;
import org.springframework.stereotype.Component;


public class KeywordCountDTO {
    private String keyword;
    private Long count;

    public KeywordCountDTO(String keyword, Long count) {
        this.keyword = keyword;
        this.count = count;
    }

    public String getKeyword() {
        return keyword;
    }

    public Long getCount() {
        return count;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
