package com.Ritish.orderService.Client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class FullResponse {

    private Long UserId;
    private Long Bike_id;
    private String BikeName;
    private String BikeNumber;
    private String BikeType;
    private String Price;
    private List<UserMo> userMo;
}
