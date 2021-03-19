package com.cos.mybatisex01.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cos.mybatisex01.model.Product;

// 인터페이스는 메모리에 띄울 수 없음
@Mapper
public interface ProductRepository {
	public void save(Product product);
	
	public void deleteById(int id);
	
	public void update(Product product);
	
	public List<Product> findAll();
	
	public Product findById(int id);
}
