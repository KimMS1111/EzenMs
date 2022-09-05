package com.saeyan.dto;

import lombok.Data;

/*
CREATE table product(
	    code NUMBER(5),
	    name VARCHAR2(100),
	    price NUMBER(8),
	    pictureurl VARCHAR(50),
	    description VARCHAR(1000),
	    PRIMARY key(code)
);
*/

@Data
public class ProductVO {
	private Integer code;
	private String name;
	private Integer price;
	private String pictureurl;
	private String description;
}
