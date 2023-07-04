package com.example.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Borrow implements Serializable {

    private Integer id;

    private Integer userId;

    private Integer bookId;
}
