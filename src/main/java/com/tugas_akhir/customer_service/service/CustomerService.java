package com.tugas_akhir.customer_service.service;

import com.tugas_akhir.customer_service.entity.Customer;
import com.tugas_akhir.customer_service.repository.RepoCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private RepoCustomer repoCustomer;

    public Customer save(Customer customer) {
        return repoCustomer.save(customer);
    }
    public Customer findById(Long id) {
        return repoCustomer.findById(id).orElse(null);
    }

    public Iterable<Customer> findAll() {
        return repoCustomer.findAll();
    }

    public Customer findByEmail(String email) {
        return repoCustomer.findByEmail(email);
    }
}
