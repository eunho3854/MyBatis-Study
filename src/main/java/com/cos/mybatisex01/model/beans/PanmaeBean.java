package com.cos.mybatisex01.model.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PanmaeBean {
	
	// panmae
	private int id;
	private String username;
	
	// product
	private String name;
	private String code;
}
