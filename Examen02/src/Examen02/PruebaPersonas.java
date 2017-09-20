/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen02;

/**
 *
 * @author ERICK
 */
public class PruebaPersonas {

    public static void main(String[] args) {

        Fecha fecha1 = new Fecha(22, 2, 1827);
        Fecha fecha2 = new Fecha(28, 8, 1829);
        Fecha fecha3 = new Fecha(29, 5, 1829);
        Fecha fecha4 = new Fecha(8, 10, 1834);
        Fecha fecha5 = new Fecha(26, 6, 1828);
        Fecha fecha6 = new Fecha(3, 4, 1833);
        Fecha fecha7 = new Fecha(10, 7, 1786);
        String[] mat1 = new String[3];
        String[] mat2 = new String[2];
        String mat3[] = new String[3];

        mat1[0] = "Programacion";
        mat1[1] = "Proyecto Desarrollo";
        mat1[2] = "Sistemas Inteligentes";
        mat2[0] = "Analisis Algoritmos";
        mat2[1] = "Multiagentes";
        mat3[0] = "Programacion";
        mat3[1] = "Interaccion";
        mat3[2] = "Sistemas Operativos";

        Estudiante juan = new Estudiante("Juan", "Escutia", fecha1, "IIS", 1234, 98.5, 40.0);
        Estudiante agustin = new Estudiante("Agustin", "Melgar", fecha2, "ISC", 9876);
        Estudiante fernando = new Estudiante("Fernando", "Montes de Oca", fecha3, "INT", 7777, 85.0, 70.0);
        Profesor francisco = new Profesor("Francisco", "Marquez", fecha4, "ISC", "Doctor", 3456, 45000.0, mat1);
        Profesor juanB = new Profesor("Juan", "De la Barrera", fecha5, "IME", "Maestro", 1234, 33000.0, mat2);
        Profesor vicente = new Profesor("Vicente", "Suarez", fecha6, "ISC", "Maestro", 9876, 20000.0, mat3);

        Persona nicolas = new Persona("Nicolas", "Bravo", fecha7);

        System.out.println("**  Probando Persona  **\n");
        System.out.println(nicolas.toString());

        System.out.println("\n\n **  Probando Estudiantes  **\n");
        System.out.println(juan.toString());
        System.out.println(agustin.toString());
        System.out.println(fernando.toString());

        System.out.println("\n\n **  Probando Profesores  **\n");
        System.out.println(francisco.toString());
        System.out.println(juanB.toString());
        System.out.println(vicente.toString());

        System.out.println("\n\n **  Actualizando sueldo de los profesores  **\n");
        vicente.setSueldo(37000.0);
        francisco.setSueldo(45000.0);
        juanB.setSueldo(55000.0);
        System.out.println(vicente.toString());
        System.out.println(francisco.toString());
        System.out.println(juanB.toString());

        System.out.println("\n\n **  Actualizando becas de los estudiantes  **\n");
        juan.setBeca(60.0);
        agustin.setBeca(80.0);
        fernando.setBeca(95.0);
        System.out.println(juan.toString());
        System.out.println(agustin.toString());
        System.out.println(fernando.toString());

        System.out.println("\n\n");
    }
}
