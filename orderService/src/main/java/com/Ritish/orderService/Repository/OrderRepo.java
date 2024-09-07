package com.Ritish.orderService.Repository;


import com.Ritish.orderService.Model.OrderMod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<OrderMod,Long> {


}
