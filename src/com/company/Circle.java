package com.company;

public class Circle {
    private int radius;
    private int LengthCircle;
    public Circle(int radius, int LengthCircle){
        this.LengthCircle = LengthCircle;
        this.radius = radius;

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getLengthCircle() {
        return LengthCircle;
    }

    public void setLengthCircle(int lengthCircle) {
        LengthCircle = lengthCircle;
    }
    public void ShowResult(){
        System.out.println("Радиус: " + radius + " " + "Длинна окружности: " + LengthCircle);
    }
}
