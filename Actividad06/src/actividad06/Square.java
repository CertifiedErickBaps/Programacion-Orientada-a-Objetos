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
public class Square extends Rectangle{
    
    public Square(){ 
        side = 1.0;
    }
    public Square(double side){
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        super(side, color, filled);
    }
    public double getSide(){
        return length;
    }
    public void setSide( double newSide){
        width = newSide;
        length= newSide;
    }
    public void setWidth(double side){
        width = side;
        length = side;
    }
    public void setLength(double side){
        length=side;
        width = side;
    }
    public String toString() {
        return "El cuadrado tiene sus lados de "+ getSide();
    }
    
}