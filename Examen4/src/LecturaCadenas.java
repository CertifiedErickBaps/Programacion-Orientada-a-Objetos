
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
 
public class LecturaCadenas {
 
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        System.out.println("Procesando woo-oo.txt");
        processFile("woo-oo.txt", 'd');
        System.out.println("");
        System.out.println("Procesando archivoInexistente");
        processFile("archivoInexsistente.txt", 'a');
    }
 
 
    public static void processFile(String filename, char c) {
        try {
            Scanner s = new Scanner(new BufferedReader(new FileReader(filename)));
            int numChars = 0;
            String biggest = "";
            while(s.hasNext()){
                String word = s.next();
                if(word.length() > biggest.length()){
                    biggest = word;
                }
                for(int i = 0; i < word.length(); i ++){
                    if(word.charAt(i)== c){
                        numChars ++; 
                    }
                }
            }
            System.out.println("La palabra mas larga es" + biggest);
            System.out.println("El caracter" + c + " aparece " + numChars + " veces.");
            s.close();   
        }catch(FileNotFoundException ex){
            System.out.println("El archivo no existe");
        }
    }
 
}