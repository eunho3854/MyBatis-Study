package com.cos.mybatisex01.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
public class DataAccessConfig {
	
	// SqlSession (연결과 인증이 끝난 객체)
	// SqlSession을 만들기 위한 공장 생성
	// 1. DataSource 등록 => yml에서 만들어진 것을 가져옴.
	// 2. xml 파일 연결
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean(); // 공장을 만듦
		sessionFactoryBean.setDataSource(dataSource);
		sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("mapper/*.xml"));
		return sessionFactoryBean.getObject();
	}
	
	// sqlSession 만들기
	// 1. SqlSession은 인터페이스에서 직접 만들면 번거롭기 때문에 SqlSessionTemplate 사용 (편함)
	@Bean
	public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}