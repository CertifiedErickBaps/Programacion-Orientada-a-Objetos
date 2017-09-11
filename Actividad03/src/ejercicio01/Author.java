/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

/**
 *
 * @author ERICK
 */
public class Author {
    private String name;
    private String mail;
    private char gender;

    public Author(String name, String mail, char gender){
       this.name = name;
       this.mail = mail;
       this.gender = gender;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return mail;
    }
    public void setEmail(String email){
        this.name = name;
    }
    public char getGender(){
        if (gender == 'm') {
            return this.gender;
        }
        else if (gender == 'f') {
            return this.gender;
        }
        else {
            System.out.print("Opcion invalida\n");
        }
    
        return 0;
    }
    
    public String toString(){
        return "Author[" + this.name + " " + this.mail + " " + this.gender + "]";
    }
    
    
    
}

