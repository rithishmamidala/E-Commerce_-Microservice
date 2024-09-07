package com.Ritish.orderService.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class OrderMod {

    @Id
    private long UserId; //primary key
    private long Bike_id; // foreign key
    private String BikeName;
    private String BikeNumber;
    private String BikeType;
    private String Price;
}
