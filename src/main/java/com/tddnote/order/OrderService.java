package com.tddnote.order;

import com.tddnote.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final UserService userService;
    public Order createOrder(Order order){
        userService.findByUserId(order.getCustomerId());
        return orderRepository.save(order);
    }
    public Order updateOrder(Order order){
        return orderRepository.save(order);
    }
    public List<Order> findAll(){
        return orderRepository.findAll();
    }
}
