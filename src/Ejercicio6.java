
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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int numtrab;
        System.out.println("Digite el numero de trabajadores");
        numtrab=teclado.nextInt();
        teclado.nextLine();
        String[] nomapel=new String[numtrab];
        int[] edad=new int[numtrab];
        double[] salario=new double[numtrab];
        double prom=0;
        double suma=0;
        int i;
        int cont=0;
        for(i=0;i<numtrab;i++){
            System.out.println("Trabajador "+(++cont));
            System.out.println("Digite nombre y apellido");
            nomapel[i]=teclado.nextLine();
            System.out.println("Digite la edad ");
            edad[i]=teclado.nextInt();
            System.out.println("Digite el Salario");
            salario[i]=teclado.nextDouble();
            teclado.nextLine();
        }
        cont=0;
        for(i=0;i<numtrab;i++){
            System.out.println("Trabajador "+(++cont));
            System.out.println("nombre y apellido="+nomapel[i]);
            System.out.println("Digite la edad "+edad[i]);
            System.out.println("Digite el Salario "+salario[i]);
            
        }
        System.out.println("****ALERTA*********");
        for(i=0;i<numtrab;i++){
           if(edad[i]<30 && salario[i]>250000) 
            System.out.println("Trabajador codigo "+(i));
            System.out.println("nombre y apellido="+nomapel[i]);
            System.out.println("Digite la edad "+edad[i]);
            System.out.println("Digite el Salario "+salario[i]);
            
        }
        
         for(i=0;i<numtrab;i++){
             suma+=salario[i];
         }
         
         prom=suma/numtrab;
         System.out.println("El promedio de sueldo es "+prom);
        
    }
    
}
