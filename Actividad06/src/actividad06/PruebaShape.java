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
public class PruebaShape {
    
    public static void main(String[] args){
        
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); //which version?
        System.out.println(s1.getArea()); //which version?
        System.out.println(s1.getPerimeter()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(s1.getRadius()); // No tiene el metodo señalizado en la parte de Shape, si se hubiera puesto al reves tendria una salida.
        
        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        Shape s2 = new Shape(); //No regresa ningun valor 

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println(s3.getLength()); //No se ha creado el metodo getLenght en la clase Shape

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength()); 
        

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide()); //El valor de side no esta puesto como atributo en la clase Square
        //ademas el superconstructor no inicializa por no haberse creado de la manera en que lo requiere en el texto, tendriamos que crear un nuevo constructor de nuevo

        //Take note that we downcast Shape s4 to Rectangle,
        //which is a superclass of Square, instead of Square
        
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(r2.getSide()); //La variable side no ha sido iniciada como atributo dentro de la clase rectangulo
        System.out.println(r2.getLength());

        // Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());//Tomamos como valores los de width y length pero solo el programa poda inizializar cual tomar
        System.out.println(sq1.getLength());//Asi que los valores dados pueden confundir la logica del programa incializando los valores de Widht y Lenght con un nuevo side.
    }
}
