package com.Ritish.orderService.Client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserMo {
    private Long id; //primary key
    private Long Userid; //foreign key
    private String UserName;
    private String email;
    private String password;
}
