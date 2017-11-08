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
public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){
    }
    public Shape(String color, boolean filled){
        this.color= color;
        this.filled= filled;
        
    }
    public String getColor(){
        return color;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean newFilled){
        filled = newFilled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
    
}
