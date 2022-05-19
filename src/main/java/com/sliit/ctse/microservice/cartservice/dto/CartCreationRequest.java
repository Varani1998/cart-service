package com.sliit.ctse.microservice.cartservice.dto;

import lombok.Data;

@Data
public class CartCreationRequest {

    private String cartID;
    private String productName;
    private String wishlistID;
    private String price;

}
