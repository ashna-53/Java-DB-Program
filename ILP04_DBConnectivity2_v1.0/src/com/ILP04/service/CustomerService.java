package com.ILP04.service;

import java.util.ArrayList;

import com.ILP04.entity.Customer;

public interface CustomerService {
   public ArrayList<Customer> getAllCustomers();
   public default  int insertIntoCustomer(Customer customer) {
	// TODO Auto-generated method stub
	return 0;
}
   public int updateCustomer(Customer customer);

}
