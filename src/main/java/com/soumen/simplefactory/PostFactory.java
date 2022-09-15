package com.soumen.simplefactory;

/**
 *
 */

public class PostFactory {
     public static Post createPost(String type){
         switch(type){
             case "news":
                 return new NewsPost();

             case "product":
                 return new ProductPost();

             case "Blog":
                 return new BlogPost();

             default:
                 throw new IllegalArgumentException("Product type is not valid");
         }
     }
}
