package com.sliit.ctse.microservice.cartservice.dto;

import lombok.Data;

@Data
public class CartResponse {

    private String cartId;
    private String wishlistId;
    private String message;

}
