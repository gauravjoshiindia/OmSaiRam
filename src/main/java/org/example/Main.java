package org.example;

import org.hamcrest.MatcherAssert;

public class Main {
    public static void main(String[] args) {
        Widget widget = Widget.builder().name("TestWidget").id(1).build();
        MatcherAssert.assertThat("Name is not correct", widget.getName().equalsIgnoreCase("testwidget") );
        MatcherAssert.assertThat("ID is Incorrect", widget.getId()==2);
        System.out.printf("Hello and welcome!");
    }
}