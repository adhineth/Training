package com.assignment2;


public class Rectangle extends Shape{
    public int getLength() {
        return length;
    }

    private int length = 4;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    private int width = 5;
    public void setLength(int length){
        this.length = length;
    }
    public int getArea(){
        return length * width;
    }

    public void tryArea(){

        Rectangle rectangle1 = new Rectangle();
        rectangle1.length = 20;
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        //Rectangle rectangle1 = new Rectangle(); //created a new object Rectangle() and assigned it to rectangle
        /*int area = rectangle.getArea();
        System.out.println(area);*/
        System.out.println(rectangle.getArea());
        //int area = getArea();
        //System.out.println(getArea());
        rectangle.length = 11;
        //System.out.println(getArea());
        //System.out.println(area);
        System.out.println(rectangle.getArea());
    }

    public static int abc;
}
