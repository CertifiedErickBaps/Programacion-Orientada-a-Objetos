/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg09;

import java.util.Random;
 
public class Oraciones {
     
    public static void imprimeOraciones(int total){
        Random rnd = new Random();
        String[] articulo = {"el","la","ningun","algun","un","una"};
        String[] nombre = {"hombre","perro","ninio","doctor","auto"};
        String[] verbo = {"manejo","solto","corrio","camino","brinco"};
        String[] preposicion = {"a","desde","sobre","con","en","de","hacia"};
        
        StringBuilder oracion = new StringBuilder();
        for(int i = 1; i <= total; i++){
            String a = articulo[rnd.nextInt(articulo.length)];
            String b = nombre[rnd.nextInt(nombre.length)];
            String c = verbo[rnd.nextInt(verbo.length)];
            String d = preposicion[rnd.nextInt(preposicion.length)];
            oracion.append(a).append(" ").append(b).append(" ").append(c).append(" ").append(d).append(" ").append(a).append(" ").append(b).append("." + "\n");
        }
        System.out.println(oracion);
    }     
     
    public static String cambiaCadena(String str, String pal1, String pal2) {
        String[] cadena = str.split(" ");
        String delimiter = " ";
        StringBuilder newcadena = new StringBuilder();

        for(int i = 0; i < cadena.length; i++){
            if(cadena[i].equals(pal1)){
                cadena[i] = pal2;
            }    
        }    
        
        for(String element : cadena){
            if(newcadena.length() > 0){
                newcadena.append(delimiter);
            }
            newcadena.append(element);
        }
        String stringCadena = newcadena.toString();

        return stringCadena;
        
    }
 
    public static String eliminaPalabra(String str, String pal1) {
        String[] cadena = str.split(" ");
        String delimiter = " ";
        StringBuilder newcadena = new StringBuilder();

        for(int i = 0; i < cadena.length; i++){
            if(cadena[i].equals(pal1)) {
                cadena[i] = "";
            }
            else if(cadena[i].equals(pal1 + ",")){
                cadena[i] = ",";
            }
        }    
        
        for(String element : cadena){
            if(newcadena.length() > 0){
                newcadena.append(delimiter);
            }
            newcadena.append(element);
        }
        String stringCadena = newcadena.toString();

        return stringCadena;
    }
     
 
         
    public static void main(String args[]){
         
// Probando la generacion aleatoria de oraciones
         
        System.out.println("\n\n***  Generando 5 oraciones aleatorias  *** \n");
         
        imprimeOraciones(5);
 
 
// Probando la sustitucion de una palabra por otra
         
        System.out.println("\n\n***  Probando la sustitucion de una palabra por otra  *** \n");
 
        String str2 = "Hola mundo como esta el mundo de bien o mal del mundo";
         
        System.out.println("\nLa oracion es: " + str2);
         
        System.out.print("\nLa palabra a cambiar es: mundo ");
                     
        System.out.print("\nLa palabra por la cual va a cambiar es: auto");
         
         
        System.out.println("\nLa cadena modificada es: " + cambiaCadena(str2, "mundo", "auto"));    
             
 
        System.out.println("\n\n***  Probando la sustitucion de una palabra (que NO existe) por otra  *** \n");
 
        str2 = "Hola mundo como esta el mundo de bien o mal del mundo";
         
        System.out.println("\nLa oracion es: " + str2);
         
        System.out.print("\nLa palabra a cambiar es: luna ");
                     
        System.out.print("\nLa palabra por la cual va a cambiar es: marte");
         
         
        System.out.println("\nLa cadena modificada es: " + cambiaCadena(str2, "luna", "marte"));    
         
         
// Probando la eliminación de todas las ocurrencias de una palabra
 
        System.out.println("\n\n***  Probando la eliminacion de TODAS las ocurrencias de una palabra  *** \n");
 
        str2 = "Hola mundo como esta todo el mundo, como vemos el dia de hoy en el mundo";
         
        System.out.println("\nLa oracion es: " + str2);
         
        System.out.print("\nLa palabra a eliminar es: mundo ");
                             
        System.out.println("\nLa cadena modificada es: " + eliminaPalabra(str2, "mundo"));  
             
 
        System.out.println("\n\n***  Probando la eliminacion de TODAS las ocurrencias de una palabra (que NO existe) *** \n");
 
        str2 = "Hola mundo como esta todo el mundo, como vemos el dia de hoy en el mundo";
         
        System.out.println("\nLa oracion es: " + str2);
         
        System.out.print("\nLa palabra a cambiar es: luna ");       
         
        System.out.println("\nLa cadena modificada es: " + eliminaPalabra(str2, "luna"));   
         
                     
     
        System.out.println("\n\n");
    }

}