package javaapplication14;





// Nombre: Felipe Osornio Jiménez
// Matricula: A01377154

public class SimpleTable {
	
	int[] table;
	
	public SimpleTable(){
            table = new int[100];
	}
	
	public void add(int element){
            int i = element % 103;
            table[i] = element;
	}
	
        @Override
	public String toString(){
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < table.length; i++){ 
            if(table[i] != 0)
                s.append(table[i] + " ");
        }    
        return s.toString();
            
	}

}
