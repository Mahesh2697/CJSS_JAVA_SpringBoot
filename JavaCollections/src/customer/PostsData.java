package customer;

public class PostsData {
    int postid;
    String email;
    String heading;
    String description;

    public PostsData(int postid, String email, String heading, String description) {
        this.postid = postid;
        this.email = email;
        this.heading = heading;
        this.description = description;
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

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
