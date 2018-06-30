package com.study4j.distMall.service.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Test {

    @Id
    @Column
    private int id;

    @Column
    private String name;

}
