package com.tugas_akhir.customer_service.controller;

import com.tugas_akhir.customer_service.dto.SearchEmailRequest;
import com.tugas_akhir.customer_service.entity.Customer;
import com.tugas_akhir.customer_service.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Customer save(@RequestBody Customer customer) {

        return customerService.save(customer);
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable("id") Long id) {

        return customerService.findById(id);
    }

    @GetMapping
    public Iterable<Customer> findAll() {

        return customerService.findAll();
    }

    @PostMapping("/search-by-email")
    public Customer findEmail(@RequestBody SearchEmailRequest form) {

        return customerService.findByEmail(form.getEmail());
    }
}
