package com.shop.services;

import com.shop.domain.Customer;
import com.shop.repository.CustomerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesServiceImpl implements SalesService {

    @Autowired CustomerRepository customerRepository;
    
    @Override
    public List<Customer> test() {
        return customerRepository.findAll();
    }

    
}
