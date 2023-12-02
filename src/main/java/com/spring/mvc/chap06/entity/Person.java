package com.spring.mvc.chap06.entity;

import lombok.*;

@Setter @Getter @ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String id;
    private String personName;
    private int personAge;
}
