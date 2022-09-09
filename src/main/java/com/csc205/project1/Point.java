package com.csc205.project1;

public class Point {

    double x;
    double y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Distance calculation to point 2
    public double distance(Point n) {
        return Math.sqrt(Math.pow(n.getY() - this.getY(), 2)) + Math.pow(n.getX() - this.getX(), 2);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void shiftX(double n) {
        this.setX(this.getX() + n);
    }

    public void shiftY(double n){
        this.setY(this.getY() + n);
    }

    public void rotate (double rotation) {
        this.setX((this.getX() * Math.cos(rotation)) - (this.getY() * Math.sin(rotation)));
        this.setY((this.getX() * Math.sin(rotation)) + (this.getY() * Math.cos(rotation)));
    }

    public String toString() {
        return "Point { x = " + this.getX() + ", y= " + this.getY() + " }" ;
    }
    }

