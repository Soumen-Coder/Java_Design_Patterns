package com.soumen.simplefactory;

import java.time.LocalDate;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Abstract post class. Represents a generic post on a web site.
 */

@Getter @Setter @NoArgsConstructor
public class Post {
    private Long id;
    private String title;
    private String content;
    private LocalDate createdOn;
    private LocalDate publishedOn;
}
