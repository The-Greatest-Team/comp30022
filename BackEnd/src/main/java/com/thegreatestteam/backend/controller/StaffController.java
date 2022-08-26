package com.thegreatestteam.backend.controller;


import com.thegreatestteam.backend.model.Ingredient;
import com.thegreatestteam.backend.model.Item;
import com.thegreatestteam.backend.model.Order;
import com.thegreatestteam.backend.repository.IngredientRepository;
import com.thegreatestteam.backend.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {

    private final StaffRepository staffRepository;

    @Autowired
    public StaffController(StaffRepository staffRepository){
        this.staffRepository = staffRepository;
    }
    //Login

    // Staff dashboard
    @GetMapping("/{staffId}")
    public String getDashboard(@PathVariable Integer staffId){
        return "Getting Dashboard page";
    }

    // Staff Profile
    @GetMapping("/{staffId}/profile")
    public String getProfile(@PathVariable String staffId){
        return "getting profile page";
    }




    // Edit profile




    // Order summary


    // edit menu
}
