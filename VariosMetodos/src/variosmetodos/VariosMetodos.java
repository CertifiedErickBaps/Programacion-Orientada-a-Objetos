/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variosmetodos;
import java.util.Scanner;

public class VariosMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            Scanner sc = new Scanner(System.in);  //crear un objeto Scanner
            System.out.println("Menu");
            System.out.println("----------------------");
            System.out.println("1. Calorias consumidas");
            System.out.println("2. Centigrados a Fahrenheit");
            System.out.println("3. Ecuacion de segundo grado");
            System.out.println("4. Progresion aritmetica");
            System.out.println("5. Sueldo final");
            System.out.println("6. Salir");
            System.out.print("Dame tu opcion: ");

            String menu = sc.next();

            switch(menu){    

                case "1":
                    double total = 0;
                    System.out.println("Peso en kg");
                    double peso = sc.nextDouble();
                    
                    for(int i = 0;i < 3; i++){
                        System.out.println("Actividad: ");
                        String actividad = sc.next();
                        System.out.println("Tiempo en minutos: ");
                        int tiempo = sc.nextInt();
                        total = calorias(actividad, tiempo, peso);
                    }
                    
                    System.out.println("El total de calorias consumidas por minuto son: " + total);
                    break;

                case "2":
                    System.out.println("Temperatura en Celsius");
                    double celsius = sc.nextDouble();
                    System.out.println("El total en grados Fahrenheit es:" + temperatura(celsius));
                    break;

                case "3":
                    System.out.println("Dame los parametros");
                    System.out.println("Dame el valor de a");
                    int a = sc.nextInt();
                    System.out.println("Dame el valor de b");
                    int b = sc.nextInt();
                    System.out.println("Dame el valor de c");
                    int c = sc.nextInt();
                    System.out.println("El valor total de esta cuadratica es");
                    cuadratica(a,b,c);
                    break;
                case "4":
                    System.out.println("Introduce a");
                    int a1 = sc.nextInt();
                    System.out.println("Introduce b");
                    int an = sc.nextInt();
                    System.out.println("El resultado:");
                    System.out.println(progresion(a1, an));
                    break;
                case "5":
                    System.out.println("Introduce sueldo");
                    double sueldo = sc.nextDouble();
                    System.out.println("Introduce prestaciones");
                    double prestaciones = sc.nextDouble();
                    System.out.println("Introduce el tope");
                    double tope = sc.nextDouble();
                    System.out.println(sueldoFinal(sueldo, prestaciones, tope));
                    break;
                case "6":
                    exit = true;
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;

            }
        }
        
    }
    public static double calorias(String actividad, int tiempo, double peso){
        
    int mets;
    switch(actividad){
        case "correr":
            mets = 10;
            break;
        case "basketball":
            mets = 8;
            break;
        case "tenis":
            mets = 4;
            break;
        case "cocinar":
            mets = 2;
            break;
        case "dormir":
            mets = 1;
            break;
        case "leer":
            mets = 1;
            break;
        case "bailar":
            mets = 3;
            break;
        case "caminar":
            mets = 2;
            break;
        default:
            mets = 0;
    }
    double formula = (0.0175 * mets * peso * tiempo);
    
    return formula;
    }
    
    public static double temperatura(double celsius){
    
    double formula1 = ((9/5)* celsius + 32 );
    return formula1;
    }
    
    public static void cuadratica(int a, int b, int c) {
        double x = (b*b);
        double y = (4 * a * c);
        double z = (2 * a);
        double w = (Math.sqrt(x - y));
        double x1 = ((-b)+w) / (z);
        double x2 = ((-b)-w)/ (2 * a);
        
        if (a == 0) {
            System.out.println("Opcion Invalida tu denominador es 0, prueba otra vez.");
        }
        else if (w <= 0) {
            System.out.println("Tu raiz cuadrada debe ser mayor que 0");
        }
        else {
            System.out.println("El valor de x1 es: " + x1);
            System.out.println("El valor de x2 es: " + x2);
        }
        
    }
    
    public static double progresion(int a, int b) {
        double n = ((a - b)+1);
        double S = (((a + b) * n)/2);
        return S;
    }
    
    public static double sueldoFinal(double sueldo, double prestaciones, double tope)  {
        double ingreso = sueldo + prestaciones;
        if (ingreso >= tope ) {
            double impuestos = ingreso *.35;
            double pago = ingreso - impuestos;
            double mingresos= ingreso/2;
            if (mingresos> prestaciones){
                double extra= pago*.05;
                pago= pago+extra;
                return pago;
            }
            else{
                return pago;   
            }
        }
        
        else if(ingreso < tope){
            double impuestos = ingreso *.20;
            double pago = ingreso - impuestos;
            double mingresos= ingreso/2;
            if (mingresos> prestaciones){
                double extra= pago*.05;
                pago= (pago+extra);
                return pago;
            }
            else{
                return pago;   
            }
        }
        return 0;
    }
}

