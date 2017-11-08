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
public class ResizableRectangle extends Rectangle implements Resizable{

    public ResizableRectangle(double width, double length) {
        super(width, length);
    }
    
    @Override
    public void resize(int percent){
        width = ((percent*width)/100.0);
        length = ((percent*length)/100.0);
    }
    
}
