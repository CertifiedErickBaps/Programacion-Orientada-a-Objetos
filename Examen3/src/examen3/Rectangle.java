/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3;

/**
 *
 * @author ERICK
 */
public class Rectangle extends GeometricObject{
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    @Override
    public double getPerimeter(){
        return (2 * width) + (2 * length);
    }
    
    @Override
    public double getArea(){
        return length * width;
    }
    
    @Override
    public String toString(){
        return "Rectangulo con largo " + length + " y ancho " + width;
    }
    

    
    
    
    
}
