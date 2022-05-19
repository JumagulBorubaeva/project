package com.company.dao;

import com.company.model.User;

import java.util.ArrayList;

public class UserDao {
   private ArrayList<User>list=new ArrayList<>();

    public void setList(ArrayList<User> list) {
        this.list = list;
    }

    public ArrayList<User> getList() {
        return list;
    }
}
