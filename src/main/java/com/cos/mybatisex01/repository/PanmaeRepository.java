package com.cos.mybatisex01.repository;

import org.apache.ibatis.annotations.Mapper;

import com.cos.mybatisex01.model.beans.PanmaeBean;

// 인터페이스는 메모리에 띄울 수 없음
@Mapper
public interface PanmaeRepository {
	public PanmaeBean findByIdAndJoin(int id);
}
