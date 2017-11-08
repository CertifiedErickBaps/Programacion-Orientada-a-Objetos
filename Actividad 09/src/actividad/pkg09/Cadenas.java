/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg09;

/**
 *
 * @author ERICK
 */
public class Cadenas {
 
    public static void main(String[] args) {
        String pathName = "/programas/cadenas/misterio/tarea2.java";
        String pathName2 = "/programas/cadenas/tarea2.txt";
 
        System.out.println("\nLa ruta es: " + Cadenas.getPath(pathName));
        System.out.println("\nEl archivo es: " + Cadenas.getFile(pathName));
        System.out.println("\nLa clase es: " + Cadenas.getClassName(pathName));
 
        System.out.println("\nLa ruta es: " + Cadenas.getPath(pathName2));
        System.out.println("\nEl archivo es: " + Cadenas.getFile(pathName2));
        System.out.println("\nLa clase es: " + Cadenas.getClassName(pathName2));
        
    }
 
    public static String getPath(String str) {
        return str.substring(0, str.lastIndexOf('/') + 1);
    }
 
    public static String getFile(String str) {
        return str.substring(str.lastIndexOf('/') + 1);
    }
 
    public static String getClassName(String str) {
        String file = Cadenas.getFile(str);
 
        String nombre = file.substring(0, file.lastIndexOf('.'));
 
        String extension = file.substring(file.lastIndexOf('.') + 1);
 
        if (extension.compareToIgnoreCase("jaVA") == 0) {
            return nombre + ".class";
        } else {
            return nombre;
        }
 
    }
 
}
