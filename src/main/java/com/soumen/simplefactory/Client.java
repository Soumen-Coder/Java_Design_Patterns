package com.soumen.simplefactory;

public class Client {

    public static void main(String[] args) {

        Post post = PostFactory.createPost("product".toLowerCase());
        System.out.println(post);
    }

}
