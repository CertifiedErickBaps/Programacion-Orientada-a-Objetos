package actividad.pkg09;

/*
 * Leyendo un archivo con Scanner
 */

import java.io.*;
import java.util.*;



public class ArchivoCadenas {

	public static void main(String[] args) {

		String linea, nombre, id = null, calif;
		
		Scanner entrada = null;

		try{
                    entrada = new Scanner(new FileReader("Entrada.txt"));
                    entrada.useDelimiter("[\t\n\r]+");
                    List<Integer> idList = new ArrayList<>();
                    List<String> nameList = new ArrayList<>();
                    List<Double> califList = new ArrayList<>();
                    int java = 0;
                    int count = 0;
                    double intPromedio = 0;
                    double doublePromedio = 0f;
                    String minWord = "";
                    String maxWord = "";
                    while ( entrada.hasNextLine() ) {
                        count++;
                        linea = entrada.nextLine();
                        nombre = linea.substring(0,linea.indexOf('\t'));
                        id= linea.substring(linea.indexOf('\t')+1, linea.lastIndexOf('\t'));
                        calif = linea.substring(linea.lastIndexOf('\t')+1);
                        int a = Integer.parseInt(id);
                        String b = nombre;
                        double c = Double.parseDouble(calif);
                        System.out.println(nombre + "\t\t" + id + " \t " + calif);
                        
                        if(nombre.toLowerCase().equals("java")){
                            java ++;
                        }
                        
                        int result = nombre.toLowerCase().compareTo(maxWord);
//                        for(int i = 0; i < nombre.length(); i++){
//                            if(nombre[i] == maxWord){
//                            }
//                        }
                        
                        
                        intPromedio += a;
                        doublePromedio += c;
                        
                        
                        idList.add(a);
                        nameList.add(b);
                        califList.add(c);
                    }
                    intPromedio /= count;
                    doublePromedio /= count;
                    
                    int max = 0;
                    for(int i = 0; i < idList.size(); i++){
                        if(idList.get(i)> max){
                            max = idList.get(i);
                        }
                    }
                    int min = max;
                    for (int i = 0; i < idList.size(); i++) {
                        if (idList.get(i) < min) {
                        min = idList.get(i);
                        }
                    }
                    
                    double max1 = 0;
                    for(int i = 0; i < califList.size(); i++){
                        if(califList.get(i)> max1){
                            max1 = califList.get(i);
                        }
                    }
                    double min1 = max1;
                    for (int i = 0; i < califList.size(); i++) {
                        if (califList.get(i) < min1) {
                        min1 = califList.get(i);
                        }
                    }
                    
                    System.out.println("El menor de los datos enteros es: " + min);
                    System.out.println("El mayor de los datos enteros es: " + max);
                    System.out.println("EL menor de los datos doubles es: " + min1 );
                    System.out.println("EL mayor de los datos doubles es: " + max1);
                    System.out.println("El promedio de los datos enteros es: " + intPromedio);
                    System.out.println("El promedio de los datos doubles es: " + doublePromedio);
                    System.out.println("La cadena lexicograficamente mayor es: " + maxWord);
                    System.out.println("La cadena lexicograficamente menor es: " + minWord);
                    System.out.println("La palabra java se encontro " + java + " veces en el archivo");
                    
		}catch (FileNotFoundException e) {
			System.err.println("Archivo no encontrado");
		}catch (IOException ex) {
                    System.out.println("Error al escribir en el archivo" + ex);
                }catch (NumberFormatException e) {
			System.err.println("Error en el tipo de datos esperado");
		} 

		finally {
			entrada.close();
                }
	}
}
