package main;

import repository.CustomerRepository;
import repository.CustomerRepositoryImpl;
import service.CustomerService;

public class Main {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        CustomerService customerService = new CustomerService(customerRepository);

        System.out.println(customerService.getCustomer(1));
    }
}
