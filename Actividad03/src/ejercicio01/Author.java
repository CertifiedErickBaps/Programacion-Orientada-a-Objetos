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
        return name;
    }
    public String getEmail(){
        return mail;
    }
    public void setEmail(String newEmail){
        mail = newEmail;
    }
    public char getGender(){
        return gender;
    }
    
    public String toString(){
        String st = "Author[name = " + name + ", email = " + mail + ", gender = " + gender + "]";
        return st;
    }
    
}

