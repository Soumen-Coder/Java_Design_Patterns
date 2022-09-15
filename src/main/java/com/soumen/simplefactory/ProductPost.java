package com.soumen.simplefactory;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents a product post.
 *
 */

@Getter @Setter @NoArgsConstructor
public class ProductPost extends Post{
    private String imageUrl;
    private String name;
}
