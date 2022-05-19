package com.company;

import com.company.model.GENDER;
import com.company.model.User;
import com.company.service.impl.UserServiceImpl;

public class Main {

    public static void main(String[] args) {


        UserServiceImpl userService = new UserServiceImpl();
        userService.UserKoshy(new User(1, "Chynara", 15, GENDER.FAMALE));
        userService.UserKoshy(new User(2, "Nurlan", 25, GENDER.FAMALE));
        userService.UserKoshy(new User(3, "Nurbol", 10, GENDER.FAMALE));
        System.out.println(userService.UseridAlu(2));
        userService.UserAluu();
        userService.UserOchuru(2);
        userService.UserAluu();
    }
}
