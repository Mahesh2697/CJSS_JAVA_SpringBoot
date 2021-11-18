//      Customer
//        name
//        email

//        Posts - This will have list of posts like facebook posts
//        postId
//        email (Customer email)
//        heading
//        description
//
//       Comments - This will have details of comments given for each post
//        postId - For which post comment should be added
//        email - Who are giving comment
//        comment - message of comment
//
//       Tasks:
//
//        1) By using above classes(Customer, Posts, Comments) - Add some dummy data
//        2) Print all customer details (Name, email)
//        3) Print all Posts (customer name, heading, description)
//        4) Print all comments (post initiated customer name, heading, description, comment, commented customer name
import customer.CustomerData;
import customer.PostsData;
import customer.CommentsData;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class main {

    public static void main(String[] args) {

        System.out.println("Customers Details");

        List<CustomerData> Cus = new ArrayList<>();
        CustomerData cus1 = new CustomerData("mahi", "mahi@gmail.com");
        CustomerData cus2 = new CustomerData("raki", "raki@gmail.com");
        CustomerData cus3 = new CustomerData("sai", "sai@gmail.com");
        CustomerData cus4 = new CustomerData("mohan", "mohan@gmail.com");
        CustomerData cus5 = new CustomerData("kiran", "kiran@gmail.com");

        Cus.add(cus1);
        Cus.add(cus2);
        Cus.add(cus3);
        Cus.add(cus4);
        Cus.add(cus5);


        Cus.forEach(cmstor -> {
            System.out.println("Name:" + cmstor.getName() + " " + "Email:" + cmstor.getEmail());
        });

//        for (CustomerData c : Cus) {
//            System.out.println(c.getName() + " " + c.getEmail());
//        }

        List<PostsData> post = new ArrayList<>();
        PostsData post1 = new PostsData(01, "mahi@gmail.com", "head1", "desc12");
        PostsData post2 = new PostsData(02, "raki@gmail.com", "head2", "desc13");
        PostsData post3 = new PostsData(03, "sai@gmail.com", "head3", "desc14");
        PostsData post4 = new PostsData(04, "mohan@gmail.com", "head4", "desc15");
        PostsData post5 = new PostsData(05, "kiran@gmail.com", "head5", "desc16");

        post.add(post1);
        post.add(post2);
        post.add(post3);
        post.add(post4);
        post.add(post5);


            System.out.println("Post Details");


            Cus.forEach(cs -> {
                post.stream()
                        .filter(x -> cs.getEmail().equals(x.getEmail()))
                        .forEach(y -> System.out.println("customer name:" + cs.getName() + "  " + "heading:" + y.getHeading() + "  " + "description:" + y.getDescription()));
            });

//        for (CustomerData c : Cus) {
//            for (PostsData p : post) {
//                boolean sc = c.getEmail().contains(p.getEmail());
//                if (sc == true) {
//                    System.out.println(c.getName() + " " + p.getHeading() + " " + p.getDescription());
//
//                }
//            }

        System.out.println("Comment details");


        List<String> comment0 =new ArrayList<>();
         comment0.add("good product");
         comment0.add("cheap");
         List<String> com2=new ArrayList<>();
         com2.add("not good");
        com2.add("worst product");
        com2.add("waste of money");
        List<String> com3=new ArrayList<>();
        com3.add("value for  money");
        com3.add("best product");

        List<CommentsData> comment = new ArrayList<>();
        CommentsData cmts1 = new CommentsData(01, "mahi@gmail.com",comment0);
        CommentsData cmts2 = new CommentsData(02, "raki@gmail.com",com2);
        CommentsData cmts3 = new CommentsData(03, "sai@gmail.com",com3);
        CommentsData cmts4 = new CommentsData(04, "mohan@gmail.com",com2);
        CommentsData cmts5 = new CommentsData(05, "kiran@gmail.com",comment0);

        comment.add(cmts1);
        comment.add(cmts2);
        comment.add(cmts3);
        comment.add(cmts4);
        comment.add(cmts5);

//        Cus.forEach(i ->{
//            post.forEach(u ->{
//                comment.stream().filter(y -> y.getComment() == u.getEmail()).forEach(l->System.out.println("customername:"
//                        +i.getName()+"  "+"heading:"+u.getHeading()+"  " +"description:"+u.getDescription()+"  "+"comment:"+l.getComment()+"  "
//                        +"commented customername:"+i.getName()));
//            });
//        });



        Cus.forEach(i -> {
            post.forEach(j -> {
                comment.stream().filter(cou -> i.getEmail() .equals( j.getEmail()) && j.getEmail().equals( cou.getEmail())).forEach(m->m.getComment1()
                        .forEach(cm-> System.out.println("customername:"+i.getName()+"  "+"heading:"+j.getHeading()+"  "
                                +"description:"+j.getDescription()+"  "+"comment:"+cm+"  "+"commented customername:"+i.getName())));

            });

        });

//        System.out.println("CJSS");
//        post.forEach(x-> {
//            comment.stream().filter(y-> y.getPostid() ==x.getPostid()).forEach(z->{
//                System.out.print("POSTID: "+ x.getPostid());
//                z..se(c-> System.out.print("\t comment: "+ c));
//                System.out.println();
//            });
//            });


//        Cus.stream().forEach(c -> {
//            post.stream().filter(p -> p.getEmail() == c.getEmail());
//        });
    }
}


//
//            for (CustomerData cust : Cus) {
//                for (PostsData pos : post) {
//                    for (CommentsData cm : comment) {
//
//                        if (cust.getEmail() == pos.getEmail() && pos.getPostid() == cm.getPostid()) {
//                            System.out.println(cust.getName() + " " + pos.getDescription() + " " +
//                                    pos.getHeading() + " " + cust.getName() + ": " + cm.getComment());
//                        }
//                    }
//                }
//            }
//        }
//    }
