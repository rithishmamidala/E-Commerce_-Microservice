package com.Ritish.orderService.Controller;


import com.Ritish.orderService.Client.FullResponse;
import com.Ritish.orderService.Client.UserMo;
import com.Ritish.orderService.Model.OrderMod;
import com.Ritish.orderService.Repository.OrderRepo;
import com.Ritish.orderService.feign.userFigen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")

public class OrderControl  {

    @Autowired
    private OrderRepo repoi;

    @Autowired
    private userFigen fig;

    @PostMapping("/addOrder")
    public OrderMod addOrder(@RequestBody OrderMod order) {
       return repoi.save(order);
    }
    @GetMapping("orderDetails/{id}")
    public FullResponse findOrderByID(@PathVariable Long id){

        OrderMod o = repoi.findById(id).orElse(null);
        List<UserMo> user = fig.find();
        FullResponse res = new FullResponse();
        res.setUserId(o.getUserId());
        res.setBike_id(o.getBike_id());
        res.setBikeName(o.getBikeName());
        res.setBikeNumber(o.getBikeNumber());
        res.setBikeType(o.getBikeType());
        res.setPrice(o.getPrice());
        res.setUserMo(user);

        return res;


    }

}
