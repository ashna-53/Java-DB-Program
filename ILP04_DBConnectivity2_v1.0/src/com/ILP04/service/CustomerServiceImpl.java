package com.ILP04.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ILP04.dao.CustomerDAO;
import com.ILP04.entity.Customer;

public class CustomerServiceImpl implements CustomerService {

	public ArrayList<Customer> getAllCustomers() {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		CustomerDAO customerDAO = new CustomerDAO();
		Connection connection = customerDAO.getConnection();
		customerList = customerDAO.getAllCustomers(connection);
		return customerList;
	}

	public   int insertIntoCustomer(Customer customer) {
		CustomerDAO customerDAO = new CustomerDAO();
        Connection connection = customerDAO.getConnection();
        
        int rowsAffected = customerDAO.insertCustomer(customer, connection);
        
        // Close the connection
        customerDAO.closeConnection(connection);
        
        return rowsAffected;
	}

	
	


	
	@Override
	public int updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		CustomerDAO customerDAO = new CustomerDAO();
        Connection connection = customerDAO.getConnection();
        
        int rowsAffected = customerDAO.updateCustomer(customer, connection);
        
        // Close the connection
        customerDAO.closeConnection(connection);
        
        return rowsAffected;
		
	}
}


