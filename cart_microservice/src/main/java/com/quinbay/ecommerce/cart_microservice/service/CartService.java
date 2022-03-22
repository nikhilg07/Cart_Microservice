package com.quinbay.ecommerce.cart_microservice.service;

public interface CartService {

    void addProduct(Long cartId,Long userId,Long productId);

    void deleteProduct(Long userId,Long productId);


}
