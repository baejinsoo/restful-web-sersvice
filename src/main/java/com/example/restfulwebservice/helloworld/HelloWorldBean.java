package com.example.restfulwebservice.helloworld;

import lombok.AllArgsConstructor;
import lombok.Data;

// HelloWorldBean 이 가지는 모든 필드들에 대해서 getter setter, 생성자, toString 생성
@Data
@AllArgsConstructor
public class HelloWorldBean {
    private String message;
}
