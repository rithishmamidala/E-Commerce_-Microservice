package com.Rithish.userService.UserRepository;

import com.Rithish.userService.UserModel.UserMo;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepo extends JpaRepository<UserMo,Long> {


}
