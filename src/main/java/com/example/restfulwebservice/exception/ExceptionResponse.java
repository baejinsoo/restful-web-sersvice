package com.example.restfulwebservice.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


// RestApi에서 발생할 수 있는 예외 객체에서 커스터마이징 하는 방법 -> 예외 핸들링
@Data
@AllArgsConstructor // 필드를 다 가지고 있는 생성자
@NoArgsConstructor // 매개변수가 없는 생성자
public class ExceptionResponse {
    private Date timestamp;
    private String message;
    private String details;

}
