
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int tam,busc,cont;
        cont=0;
        System.out.println("Digite el tamaño");
        tam=teclado.nextInt();
        int[] a=new int[tam];
        int i;
        for(i=0;i<a.length;i++){
            System.out.println("Digite la posicion a["+i+"]");
            a[i]=teclado.nextInt();
        }
        a[2]=0;
        for(i=0;i<a.length;i++){
            System.out.println("a["+i+"]="+a[i]);
        }
        
        System.out.println("Digite cuanto veces se repite el numero");
        busc=teclado.nextInt();
        for(i=0;i<a.length;i++){
            if(a[i]==busc){
                cont++;
            }
        }

        System.out.println("el numero "+busc+" se repite "+cont+" veces");    
    }
    
}
