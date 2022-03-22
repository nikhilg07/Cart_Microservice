package com.quinbay.ecommerce.cart_microservice.dto;

public class Cart {

    Long cartId;
    Long productId;
    Long userId;
    Long quantity;

    public Cart(){

    }

    public Cart(Long cartId, Long productId, Long userId, Long quantity) {
        this.cartId = cartId;
        this.productId = productId;
        this.userId = userId;
        this.quantity = quantity;
    }

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
