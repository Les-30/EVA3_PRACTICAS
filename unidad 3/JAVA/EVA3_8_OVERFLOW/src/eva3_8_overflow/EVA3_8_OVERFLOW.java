/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_8_overflow;

/**
 *
 * @author PEÑA HERNANDEZ LESLIE JOHANA. 18550680. ISC.
 */
public class EVA3_8_OVERFLOW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hola"); //CADENA DE TEXTO
        System.out.println(7); //ENTERO
        System.out.println(true); //BOOLEAN
        System.out.println(new EVA3_8_OVERFLOW()); //objeto
        
        
        System.out.println(suma (5,8));
        System.out.println(suma("Hola", " Usuario"));
    }
    public static int suma(int val1, int val2){
        return val1 + val2;
    }
    public static String suma(String sCade1, String sCade2){
        return sCade1 + sCade2;
}
    public static void suma(int val){
    }
    
    }
