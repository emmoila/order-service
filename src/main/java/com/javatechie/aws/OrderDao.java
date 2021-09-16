package com.javatechie.aws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {

    public List<Order> getOrders(){
        return Stream.of(
                new Order(101,"Mobile",1,30000),
                new Order(101,"Mobile",1,30000),
                new Order(101,"Emman",10,1300000),
                new Order(101,"Mobile",1,30000))
                .collect(Collectors.toList());
    }

}
