package com.company.service.impl;

import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.UserService;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDao();

    @Override
    public void UserKoshy(User user) {
     userDao.getList().add(user);
    }

    @Override
    public User UseridAlu(int id) {
        User userid=new User();
        for(User user:userDao.getList()){
            if(user.getId()==id){
                userid=user;
            }
    }
       return userid;

    }

    @Override
    public void UserOchuru(int id) {

        for(User user:userDao.getList()){
            if(user.getId()==id){
                userDao.getList().remove(user);
            }
        }

    }

    @Override
    public void UserAluu() {
        for(User user:userDao.getList()){
            System.out.println(user);
        }

    }


}

