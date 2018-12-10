/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_10_funciones;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA3_10_FUNCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PRACTICA 1:
        Scanner input = new Scanner(System.in);
        int mes;
        System.out.println("ELIGE UN NUMERO DEL 1 AL 12");
        mes = input.nextInt();
        String Smes = mesA(mes);
        
      /*//PRACTICA 2:
        String letra = null;
        System.out.println("ELIGE UNA LETRA");
        letra = input.next(letra);
        int calif = califa(letra);*/
                
        //PRACTICA 3:
        int califa;
        System.out.println("TECLEA UNA CALIFICACION");
        califa = input.nextInt();
        String letras = letras(califa);

    }
    //PRACTICA 1:
    public static String mesA (int mes ){
        String Smes = "";
         if (mes == 1) 
         System.out.println("Enero");
        else 
       if (mes == 2) 
        System.out.println("Febrero");
        else 
       if (mes == 3) 
        System.out.println("Marzo");
         else 
        if (mes == 4) 
        System.out.println("Abril");
         else 
         if (mes == 5) 
        System.out.println("Mayo");
         else 
         if (mes == 6) 
         System.out.println("Junio");
        else 
         if (mes == 7)
        System.out.println("Julio");
        else 
        if (mes == 8) 
         System.out.println("Agosto");
          else 
         if (mes == 9) 
         System.out.println("Septiembre");
          else 
          if (mes == 10) 
         System.out.println("Octubre");
          else 
        if (mes == 11) 
         System.out.println("Noviembre");
          else 
          if (mes == 12) 
        System.out.println("Diciembre");
        else 
         if (mes > 12) 
         System.out.println("Valor fuera de rango");
       
        return Smes;
        
    }
   /* //PRACTICA 2:
    public static int califa(String letra){
            int califa = 0;
         if (letra == "A") 
         System.out.println("100");
        else 
       if (letra == "B") 
        System.out.println("90");
        else 
       if (letra == "C") 
        System.out.println("80");
         else 
        if (letra == "D") 
        System.out.println("70");
         else 
         if (letra == "F")
             System.out.println("60");
         else
             System.out.println("FUERA DE RANGO");
        
         return califa;
        
   }*/
      
    //PRACTICA 3
    public static String letras (int califa ){
        String letra = "";
         if (califa == 100) 
         System.out.println("A");
        else 
       if (califa == 90) 
        System.out.println("B");
        else 
       if (califa == 80) 
        System.out.println("C");
         else 
        if (califa == 70) 
        System.out.println("D");
         else 
         if (califa == 60)
             System.out.println("F");
         else
             System.out.println("FUERA DE RANGO");
        return letra;
}
    
}
