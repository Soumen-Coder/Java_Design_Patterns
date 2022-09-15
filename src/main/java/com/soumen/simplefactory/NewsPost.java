package com.soumen.simplefactory;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
* Represents news post
*/

import java.time.LocalDate;

@Getter @Setter @NoArgsConstructor
public class NewsPost extends Post {
    private String headLine;
    private LocalDate newsTime;
}
