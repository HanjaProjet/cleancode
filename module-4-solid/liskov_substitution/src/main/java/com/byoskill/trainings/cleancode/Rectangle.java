/*
 * Copyright (C) 2017 Sylvain Leroy - BYOSkill Company All Rights Reserved
 * You may use, distribute and modify this code under the
 * terms of the MIT license, which unfortunately won't be
 * written for another century.
 *
 * You should have received a copy of the MIT license with
 * this file. If not, please write to: sleroy at byoskill.com, or visit : www.byoskill.com
 *
 */
package com.byoskill.trainings.cleancode;

public class Rectangle implements Shape {

    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return 0.5 * (width + height + Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)));
    }

    @Override
    public int numberOfSides() {
        return 3;
    }

    @Override
    public double perimeter() {
        return height + width + Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}
