package com.mkyong.common.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mkyong.common.dao.CustomerDao;
import com.mkyong.common.model.Customer;
import com.mkyong.util.CustomHibernateDaoSupport;

@Repository("customerDao")
public class CustomerDaoImpl extends CustomHibernateDaoSupport implements CustomerDao{
	
	public void save(Customer stock){
		getHibernateTemplate().save(stock);
	}
	
	public void update(Customer stock){
		getHibernateTemplate().update(stock);
	}
	
	public void delete(Customer stock){
		getHibernateTemplate().delete(stock);
	}
	
	public Customer findById(String id){
		List list = getHibernateTemplate().find("from Stock where id=?",id);
		return (Customer)list.get(0);
	}


}