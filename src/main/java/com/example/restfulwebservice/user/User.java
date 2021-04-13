package com.example.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
@JsonIgnoreProperties(value = {"password","ssn"}) // 한번에 여러개의 중요정보 Client 에게 전달해주지 않기위한 애너테이션
public class User {
    private Integer id;

    @Size(min=2, message = "Name은 2글자 이상 입력해 주세요")
    private String name;
    @Past
    private Date joinDate;

    // @JsonIgnore // 중요정보 Client 에게 전달해주지 않기위한 애너테이션
    private String password;
    private String ssn;
}
