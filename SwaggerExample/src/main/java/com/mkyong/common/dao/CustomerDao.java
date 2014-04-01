package com.mkyong.common.dao;

import com.mkyong.common.model.Customer;


public interface CustomerDao {
	
	void save(Customer stock);
	
	void update(Customer stock);
	
	void delete(Customer stock);
	
	Customer findById(String stockCode);

}
