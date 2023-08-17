

package com.mycompany.actividad_3_guia_5;

import java.util.Scanner;


public class Actividad_3_guia_5 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        System.out.println(" ingrese el tamaño deseado");
        
        int n= leer.nextInt();
        
        int [] vector= new int [n];
        
        for (int i = 0; i < n; i++) {
            
            vector[i]=(int) (Math.random()*10);
            System.out.println(vector[i]);
        }
        System.out.println("ingrese el numero que desea buscar");
        
      
       int num = leer.nextInt();
       int cont=0;
       
        for (int i = 0; i < n; i++) {
           if (vector[i]== num){
               cont++;
               System.out.println("el numero esta en la posicion "+ (i+1));
               
           }
            
        }
        System.out.println("el numero aparece esta cantidad de veces: " +cont);
    }
    
}
