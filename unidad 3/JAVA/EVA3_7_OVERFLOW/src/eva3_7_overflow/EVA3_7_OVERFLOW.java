/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_7_overflow;

/**
 *
 * @author temporal2
 */
public class EVA3_7_OVERFLOW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        miStackOverFlow();
    }
    //CUANDO UNA FUNCION SE LLAMA A SI MISMA SE LLAMA RECURSIVIDAD
    //RECURSIVIDAD-->SE ACABA LA MEMORIA (STACK OVERFLOW)
    public static void miStackOverFlow(){
        System.out.println("Hola usuario, buen día");
        miStackOverFlow();
    }
}
