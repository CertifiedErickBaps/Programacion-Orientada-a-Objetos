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
public class Rectangle extends Shape{
    protected double width;
    protected double length;
    
    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea(){
        double area = width*length;
        return area;
    }
    
    public double getPerimeter(){
        double perimetro = (2*width)+(2*length);
        return perimetro;
    }
    
    public String toString(){
        return "El area de un rectangulo es " + getArea() + ", su perimetro es de " + getPerimeter() + ".";
    }
}
