package com.byoskill.trainings.cleancode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeTest {


    @Test
    public void testRectangle() {
        Rectangle rectangle = new Rectangle(5, 2);
        System.out.println(rectangle.perimeter());
        Square square = new Square(5);
        square.setHeight(12);
        System.out.println(square.perimeter());
    }
}