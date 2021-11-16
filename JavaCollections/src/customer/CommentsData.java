package customer;

public class CommentsData {
    int postid;
    String email;
    String comment;

    public CommentsData(int postid, String email, String comment) {
        this.postid = postid;
        this.email = email;
        this.comment = comment;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
