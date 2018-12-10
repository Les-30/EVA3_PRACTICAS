/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_6_stack;

/**
 *
 * @author PEÑA HERNANDEZ LESLIE JOHANA 18550680
 */
public class EVA3_6_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  System.out.println("inicia main");
        A();
        System.out.println("termina main");  
//CODIGO   
    //STACK --> MEMORIA ESTATICA
                //VARIABLES PRIMITIVAS
                //LLAMADAS A FUNCION
   //HEAP--> MEMORIA DINÁMICA
    //OBJETOS(SON CREADOS )
    }
    public static void A(){
        System.out.println("inicia A");
        B();
        System.out.println("termina A");
    }
     public static void B(){
        System.out.println("inicia B");
        C();
        System.out.println("termina B");
}
 public static void C(){
        System.out.println("inicia C");
        System.out.println("termina C");
       
 }
}
