package com.tddnote.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    public Order createOrder(Order order){
        return orderRepository.save(order);
    }
    public List<Order> findAll(){
        return orderRepository.findAll();
    }
}
