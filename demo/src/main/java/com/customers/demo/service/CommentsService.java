package com.customers.demo.service;

import com.customers.demo.model.CommentsModel;
import com.customers.demo.model.CustomersModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CommentsService {

    private List comments = new ArrayList();

    public String addComment(CommentsModel newComment) {
        comments.add(newComment);
        return "customer added successfully";
    }

    public List<CommentsModel> getComments(){
        return comments;
    }


}



