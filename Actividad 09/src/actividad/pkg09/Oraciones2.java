/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg09;
import java.util.*;

/**
 *
 * @author ERICK
 */
public class Oraciones2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas oraciones quieres generar?: ");
        int num = sc.nextInt(); 
        Oraciones2.imprimeOraciones(num);
//------------------------------------------------------------------------------------//        
        System.out.println("***Probando la sustitucion de una palabra por otra ***");
        Scanner sc2 = new Scanner(System.in);
        System.out.println("La oracion es: ");
        String str = sc2.nextLine();
        System.out.println("La palabra a cambiar es: ");
        String oracion1 = sc2.nextLine();      
        System.out.println("La palabra por la cual va a cambiar es: ");
        String oracion2 = sc2.nextLine();
        System.out.println("La cadena modificada es: " + cambiaCadena(oracion1, oracion2, str));
//------------------------------------------------------------------------------------//
        System.out.println("***Probando la eliminiacion de TODAS las ocurrencia de una palabra ***");
        Scanner sc3 = new Scanner(System.in);
        System.out.println("La oracion es: ");
        String str1 = sc3.nextLine();
        System.out.println("La palabra a eliminar es: ");
        String orac1 = sc3.nextLine();       
        System.out.println("La cadena modificada es: " + eliminaPalabra(orac1, str1));


    }
    
    public static void imprimeOraciones(int n){    
        Random rnd = new Random();
        String[] articulo = {"El", "La", "Ningun", "Algun", "Un", "Una"};
        String[] sujeto = {"hombre", "perro", "niño", "doctor", "auto"};
        String[] verbo = {"manejo", "salto", "corrio", "camino", "brinco"};
        String[] preposicion = {"a", "desde", "sobre", "con", "en", "de", "hacia"};
                
        StringBuilder oracion = new StringBuilder();
        for(int i = 1; i <= n; i++){
            String a = articulo[rnd.nextInt(articulo.length)];
            String b = sujeto[rnd.nextInt(sujeto.length)];
            String c = verbo[rnd.nextInt(verbo.length)];
            String d = preposicion[rnd.nextInt(preposicion.length)]; 
            oracion.append(a).append(" ").append(b).append(" ").append(c).append(" ").append(d).append(" ").append(a).append(" ").append(b).append("." + "\n");
        }
        
        System.out.println(oracion);
        
    }
    
    public static String cambiaCadena(String chpalabra, String mdpalabra, String neworacion){
        if(neworacion.contains(chpalabra)){
            return((neworacion.replace(chpalabra, mdpalabra)));
        }else{
            return neworacion;
        }        
    }
    
    public static String eliminaPalabra(String str, String oracion){
        if(oracion.contains(str)){
            return oracion.replace(str, "");
        }else{
            return oracion;
        }
        
    }
    
}
