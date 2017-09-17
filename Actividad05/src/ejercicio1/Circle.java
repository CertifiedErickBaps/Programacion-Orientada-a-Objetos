/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author ERICK
 */
public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private final int AREA = 4*Math.PI*radius^2;
    
    public Circle(){}    
    public Circle(double r){
        this.radius = r;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return AREA;
    }
    
}
