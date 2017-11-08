/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad06;

/**
 *
 * @author A01379896, A01374009
 */
public class Circle extends Shape{
    protected double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    
    
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        double area = Math.PI*Math.pow(radius, 2);
        return area;
    }
    
    public double getPerimeter(){
        double perimetro = Math.PI*(radius*2);
        return perimetro;
    }

    
    public String toString() {
        return "El circulo tiene un area de " + getArea() + "con un perimetro de " + getPerimeter() + ".";
    }
    
    
}
