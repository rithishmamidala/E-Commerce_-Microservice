package com.Rithish.userService.UserModel;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserMo {
    @Id
    private Long id; //primary key
    private Long Userid; //foreign key
    private String UserName;
    private String email;
    private String password;


}
