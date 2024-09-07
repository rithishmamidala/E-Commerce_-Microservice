package com.Ritish.orderService.feign;

import com.Ritish.orderService.Client.UserMo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "userService", url = "http://localhost:9098/user")
public interface userFigen {

    @GetMapping("/findbyId/{id}")
    UserMo findUserById(@PathVariable Long id);

    @GetMapping("/find")
    List<UserMo> find();



}
