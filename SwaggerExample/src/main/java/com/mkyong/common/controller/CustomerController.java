package com.mkyong.common.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mkyong.common.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public @ResponseBody List<Customer> getCustomer(@PathVariable String id) {
		List<Customer> li = new ArrayList<Customer>();
		Customer c1 = new Customer("1","kriti","24","noida sector 62");
		Customer c2 = new Customer("2","Ashish","24","Delhi");
		Customer c3 = new Customer("3","Gaurav","54","Gurgaon");
		Customer c4 = new Customer("4","Anshika","25","noida sector 15");
		Customer c5 = new Customer("5","Abhishel","44","Krishna Nagar");
		Customer c6 = new Customer("6","Pranav Jain","27","Lakshmi nagar");
		Customer c7 = new Customer("7","Ravi","26","noida sector 52");
		Customer c8 = new Customer("8","Deepa","27","Indrapuram");
		li.add(c1);
		li.add(c2);
		li.add(c3);
		li.add(c4);
		li.add(c5);
		li.add(c6);
		li.add(c7);
		li.add(c8);
		
		return li;

	}
	
	
}