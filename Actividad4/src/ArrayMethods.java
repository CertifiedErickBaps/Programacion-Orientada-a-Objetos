
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ERICK
 */
public class ArrayMethods {

    public static void main(String[] args) {
        double[] dArr = {0, 1, 2.3, 4.5, 6.7, 6.7};
        System.out.println("Arreglo: ");
        printArray(dArr);
        System.out.println("La sumatoria de este arreglo es " + sumArray(dArr));
        System.out.println("El promedio de este arreglo es " + averageArray(dArr));
        System.out.println("Buscando 6.7" + indexOf(dArr,6.7));
        System.out.println("Buscando 4.5" + indexOf(dArr,4.5));
        System.out.println("El minimo arreglo es " + min(dArr));
        System.out.println("El maximo arreglo es " + max(dArr));
        System.out.println("Datos duplicados son " + Arrays.toString(findDuplicates(dArr)));

    }

    public static void printArray(double[] arr) {
        String st = "[";
        for (int i = 0; i < arr.length; i++) {
            st += arr[i];
            if (i != arr.length - 1) {
                st += ",";
            }
        }
        st += "]";
        System.out.println(st);

    }

    public static double sumArray(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double averageArray(double[] arr) {
        return sumArray(arr) / arr.length;
    }

    public static int indexOf(double[] arr, double e) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public static double min(double[] arr){
        double min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static double max(double[] arr){
        double max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static double[] findDuplicates(double arr[]){
        int numDups = 0;
        for (int i = 0; i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                numDups++;
                }
            }
        }
        double dups[] = new double[numDups];
        int nextIndex = 0;
        for (int a = 0; a<arr.length-1;a++){
            for(int b=a+1;b<arr.length;b++){
                if(arr[a]==arr[b]){
                dups[nextIndex++]=arr[a];
                }
            }
        }
        return dups;
    }            
}

