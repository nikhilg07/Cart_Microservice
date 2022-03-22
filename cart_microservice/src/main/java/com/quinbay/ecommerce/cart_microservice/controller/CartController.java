package com.quinbay.ecommerce.cart_microservice.controller;

import com.quinbay.ecommerce.cart_microservice.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class CartController {
    @Autowired
    CartService cartService;

    @DeleteMapping(value = "/productDelete" , produces = "application/json")
    public void delete(@RequestParam Long userId,@RequestParam Long productId){
        cartService.deleteProduct(userId,productId);
    }


    @PostMapping(value = "/addProduct",produces = "application/json")
    public void add(@RequestParam Long cartId ,@RequestParam Long userId,@RequestParam Long productId){
        cartService.addProduct(cartId,userId,productId);
    }



}


/*

@RestController

public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/addUser" , consumes = "application/json")
    public void addUser(@RequestBody @Valid User user)
    {
        userService.addUser(user);
    }

    @GetMapping(value = "/user" , produces = "application/json")
    public List<User> getStudents(){

        return userService.getAllUsers();
    }


}




 */