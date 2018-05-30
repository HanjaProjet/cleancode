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

public abstract class Shape {

    private int height;
    private int width;

    /**
     * Instantiates a new shape.
     */
    public Shape() {
        super();

    }

    /**
     * Instantiates a new shape.
     *
     * @param height the height
     * @param width  the width
     */
    public Shape(final int height, final int width) {
        super();
        this.height = height;
        this.width = width;
    }

    /**
     * Area.
     *
     * @return the float
     */
    public double area() {
        if (this instanceof Circle) {
            return Math.PI * width * width;
        } else if (this instanceof RightTriangle) {
            return 0.5 * (width + height + Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)));
        }
        return height * width;
    }

    /**
     * Number of sides.
     *
     * @return the int
     */
    public int numberOfSides() {
        if (this instanceof Rectangle) {
            return 4;
        } else if (this instanceof Circle) {
            return 0;
        } else if (this instanceof RightTriangle) {
            return 3;
        }
        return -1;
    }

    /**
     * Perimeter.
     *
     * @return the float
     */
    public double perimeter() {
        if (this instanceof Circle) {
            return 2 * Math.PI * width;
        } else if (this instanceof RightTriangle) {
            return height + width + Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        }
        return height * 2 + width * 2;

    }

    /**
     * Sets the height.
     *
     * @param height the new height
     */
    public void setHeight(final int height) {
        this.height = height;
    }

    /**
     * Sets the width.
     *
     * @param width the new width
     */
    public void setWidth(final int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Shape [height=" + height + ", width=" + width + "]";
    }

}
