package com.quinbay.ecommerce.cart_microservice.entity;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="cart")
public class CartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long cartId;

    private Long productId;

    private Long userId,quantity;

    public CartEntity( Long productId,  Long userId,  Long quantity) {
        this.productId = productId;
        this.userId = userId;
        this.quantity = quantity;
    }

    public CartEntity(Long cartId, Long productId,Long userId,  Long quantity) {
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

    public CartEntity(){}

}