package com.soumen.simplefactory;

/**
 * Represents a blog post.
 *
 */

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class BlogPost extends Post{
    private String author;
    private String[] tags;
}
