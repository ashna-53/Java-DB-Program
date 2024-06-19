package com.ILP04.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.ILP04.entity.Customer;
import com.ILP04.service.CustomerService;
import com.ILP04.service.CustomerServiceImpl;


public class CustomerUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char goToMainMenu;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("1.Display all customers, 2.Insert,3.Update");
			int mainChoice = scanner.nextInt();
			switch(mainChoice)
			{
			case 1:
				getAllCustomers();
				break;
			case 2:
				insertCustomer();
				break;
			case 3:
				updateCustomer();
			    break;
				
			default:
				break;
			}
			System.out.println("Go to main menu(y/n)");
			goToMainMenu = scanner.next().charAt(0);
			
			
		}while(goToMainMenu == 'y');
		

		}

	
	



	private static void updateCustomer() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Customer Code:");
        int customerCode = scanner.nextInt();
        System.out.print("Customer First Name: ");
        String firstName = scanner.next();
        System.out.print("Customer Last Name: ");
        String lastName = scanner.next();
        System.out.print("Address: ");
        String address = scanner.next();
        System.out.print("Phone Number: ");
        long phoneNumber = scanner.nextLong();
        System.out.print("Aadhar Number: ");
        long aadharNo = scanner.nextLong();
        CustomerService customerService = new CustomerServiceImpl();
        Customer customer = new Customer( customerCode,firstName, lastName, address, phoneNumber, aadharNo);
        int rowsUpdated = customerService.updateCustomer(customer);
        
        if (rowsUpdated > 0) {
            System.out.println("Customer updated successfully! : "+rowsUpdated);
        } else {
            System.out.println("Failed to update customer.");
        }
	}






	private static void getAllCustomers() {
		// TODO Auto-generated method stub
		CustomerService customerService = new CustomerServiceImpl();
		ArrayList<Customer> customerList = customerService.getAllCustomers();
		for(Customer customer:customerList) {
			
			System.out.println("CustomerCode:"+customer.getCustomerCode()+" CustomerFirstName:"+customer.getCustomerFirstname()+" CustomerLastName:"+
			customer.getCustomerLastname()+" Address:"+customer.getAddress()+"  PhoneNo:"+customer.getPhoneNumber()+" AadharNo"+customer.getAadharNo());
		}
		}
	 private static void insertCustomer() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for the new customer:");
        System.out.print("Customer First Name: ");
        String firstName = scanner.next();
        System.out.print("Customer Last Name: ");
        String lastName = scanner.next();
        System.out.print("Address: ");
        String address = scanner.next();
        System.out.print("Phone Number: ");
        long phoneNumber = scanner.nextLong();
        System.out.print("Aadhar Number: ");
        long aadharNo = scanner.nextLong();
        CustomerService customerService = new CustomerServiceImpl();
        Customer customer = new Customer( firstName, lastName, address, phoneNumber, aadharNo);
        
        
        int rowsInserted = customerService.insertIntoCustomer(customer);
        
        if (rowsInserted > 0) {
            System.out.println("Customer inserted successfully! : "+rowsInserted);
        } else {
            System.out.println("Failed to insert customer.");
        }
	  
}
}
