package org.example;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Widget {

    private final String name;
    private final int id;
    private final String token;
}
