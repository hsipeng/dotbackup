package com.common.util;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;


public class BaseMapper extends SqlSessionTemplate{
	public BaseMapper() {
		super((SqlSessionFactory) ApplicationContextUtil.getBean(SqlSessionFactory.class));
	}
}
