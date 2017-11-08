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
public class Circle extends GeometricObject{
    protected double radius = 1.0;
    
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getPerimeter(){
        return Math.PI * 2 * radius;
    }
    
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
    
    @Override
    public String toString(){
        return "Circulo con radio " + radius;
    }
    
    
}
