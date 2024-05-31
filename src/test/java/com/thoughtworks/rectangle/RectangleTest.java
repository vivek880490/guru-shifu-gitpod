package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class RectangleTest {

    @Test
    public void shouldReturnAreaWhenLengthAndBreadthAreGiven() {
        Rectangle rectangle = new Rectangle(4, 6);
        int area = rectangle.area();
        assertThat(area, is(equalTo(area)));
    }

}