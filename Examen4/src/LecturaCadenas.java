
import java.io.*;
import java.util.*;



public class LecturaCadenas {
        public static void processFile(String filename){
            String linea, palabra;
            String palabraLarga;
            char c = 'c';
            int contador = 0;
            try{
                FileReader fr = new FileReader(filename);
                Scanner entrada = new Scanner(fr);
                entrada.useDelimiter("[\t\n\r]+");
                List palabras = new ArrayList();
                while(entrada.hasNextLine()){
                    linea = entrada.nextLine();
                    palabras.add(linea);
                    if(palabras.contains(Character.toString(c))){
                        contador += 1;
                    }
                }
                
                System.out.println(System.getProperty("user.dir"));
                System.out.println("Procesando " + filename);
                System.out.println(palabras);
                System.out.println(contador);
            }catch (FileNotFoundException e) {
			System.err.println("Procesando archivo inexistente\nEl archivo no existe.");
            }finally{
                System.out.println("");
            }
                
            
        }
    
	public static void main(String[] args){
            processFile("woo-oo.txt");
        }
    
}
