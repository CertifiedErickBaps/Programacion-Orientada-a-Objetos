// Nombre:
// Matricula:

package examen3;

public class PruebaFiguras {
    
    public static void main(String[] args){
        Circle fig1 = new Circle(15);
        Rectangle fig2 = new Rectangle(10,20);
        ResizableCircle fig3 = new ResizableCircle(5);
        ResizableRectangle fig4 = new ResizableRectangle(5,10);
        
        System.out.println("Probando figuras");
        System.out.println("****************");
        System.out.println(fig1.toString());
        System.out.println(fig2.toString());
        System.out.println(fig3.toString());
        System.out.println(fig4.toString());
        
        fig3.resize(50);
        fig4.resize(200);
        
        System.out.println("");
        System.out.println("Despues de cambiar tamaño");
        System.out.println("****************");
        System.out.println(fig1.toString());
        System.out.println(fig2.toString());
        System.out.println(fig3.toString());
        System.out.println(fig4.toString());
        
        System.out.println("");
        System.out.println("Intentando duplicar tamaño");
        System.out.println("****************");
        doubleSize(fig1);
        doubleSize(fig2);
        doubleSize(fig3);
        doubleSize(fig4);
        System.out.println(fig3.toString());
        System.out.println(fig4.toString());
    }
    
    // Implementar el siguiente metodo
    public static void doubleSize(GeometricObject fig){
        if(fig instanceof Resizable){
            ((Resizable)fig).resize(200);
        }else{
            System.out.println(fig + " no puede ser agrandado");
        }
        // El metodo debe primero revisar si el tamaño de fig puede ser modificado,
        // si puede ser modificado el tamaño deberá ser duplicado
        // si no puede ser modificado se deberá imprimir un mensaje notificandolo
        // Ej. Círculo con radio 1.0 no puede ser agrandado
    }
     
}
