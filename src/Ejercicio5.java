/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a={1,2,3,4};
        mostrarArrayB(arrayInvertido(a));
    }
    
    public static int[] arrayInvertido(int a[]){
        int[] b=new int[a.length];
        int i,j;
        j=a.length-1;
        for(i=0;i<a.length;i++){
            b[j]=a[i];
            j--;
        }
        
        return b;
    }
    
    public static void mostrarArrayB(int b[]){
         for(int i=0;i<b.length;i++){
            System.out.print(b[i]);
        }
    }
    
}
