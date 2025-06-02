package com.tugas_akhir.customer_service.repository;

import com.tugas_akhir.customer_service.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoCustomer extends JpaRepository<Customer, Long> {
    Customer findByEmail(String email);
}
