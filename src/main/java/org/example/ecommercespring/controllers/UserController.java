package org.example.ecommercespring.controllers;

import org.example.ecommercespring.services.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final IUserService userService;

    public UserController(IUserService _userService) {
        this.userService = _userService;
    }

    
}
