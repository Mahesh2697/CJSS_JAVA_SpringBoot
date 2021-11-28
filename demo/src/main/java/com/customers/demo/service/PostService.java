package com.customers.demo.service;

import com.customers.demo.model.CustomersModel;
import com.customers.demo.model.PostsModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
 @Service
public class PostService {
    private List posts = new ArrayList();
    public String addPost(PostsModel newPost) {
        posts.add(newPost);
         return "post added successfully";
    }
    public List<PostsModel> getPosts(){
        return posts;
    }

}


