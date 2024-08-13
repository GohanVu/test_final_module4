package com.example.test_final_module4.service;



import com.example.test_final_module4.model.Orders;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IOrderService {

    Page<Orders> findAll(Pageable pageable);

    Optional<Orders> findById(Long id);

    void save(Orders orderToUpdate);
}
