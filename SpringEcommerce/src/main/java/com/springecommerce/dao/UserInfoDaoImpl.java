package com.springecommerce.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springecommerce.model.UserInfo;


@Transactional
@Repository
public class UserInfoDaoImpl implements UserInfoDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;


	@Override
	public void saveUser(UserInfo userInfo) {
		this.hibernateTemplate.save(userInfo);
	}



}
