package customer;

import java.util.*;

public class CommentsData {
    int postid;
    String email;
    List<String> comment1=new ArrayList<>();

    public CommentsData(int postid, String email, List<String> comment1) {
        this.postid = postid;
        this.email = email;
        this.comment1 = comment1;
    }

    public int getPostid() {
        return postid;
    }

    public void setPostid(int postid) {
        this.postid = postid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getComment1() {
        return comment1;
    }

    public void setComment(List<String> comment) {
        this.comment1 = comment;
    }



}