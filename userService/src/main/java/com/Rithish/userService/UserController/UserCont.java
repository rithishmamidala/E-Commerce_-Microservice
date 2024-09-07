package com.Rithish.userService.UserController;


import com.Rithish.userService.UserModel.UserMo;
import com.Rithish.userService.UserRepository.UserRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserCont {
    @Autowired
    private UserRepo userRepo;

    @PostMapping("/create")
    public UserMo createUser(@RequestBody UserMo user){
        return userRepo.save(user);
    }
    @GetMapping("findbyId/{id}")
    public UserMo findUserById(@PathVariable Long id){
        return userRepo.findById(id).orElse(null);
    }
    @GetMapping("/find")
    public List<UserMo> findUserById(){
        return userRepo.findAll();
    }


    @GetMapping("/users")
    public List<UserMo> getAllUsers(){
        return userRepo.findAll();
    }





}
