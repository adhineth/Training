package com.assignment2;

public class Square extends Rectangle{
    @Override
    public int getArea() {
        setLength(20);
        return super.getArea();
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square.getArea());
    }
}
