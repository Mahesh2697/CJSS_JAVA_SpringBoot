package com.customers.demo.model;

import java.util.List;

public class CustomersModel {

   private  String name;
   private String email;
   private List<CommentsModel> customersCommentList;
   private List<PostsModel> customersPostList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<CommentsModel> getCustomersCommentList() {
        return customersCommentList;
    }

    public void setCustomersCommentList(List<CommentsModel> customersCommentList) {
        this.customersCommentList = customersCommentList;
    }

    public List<PostsModel> getCustomersPostList() {
        return customersPostList;
    }

    public void setCustomersPostList(List<PostsModel> customersPostList) {
        this.customersPostList = customersPostList;
    }
}
