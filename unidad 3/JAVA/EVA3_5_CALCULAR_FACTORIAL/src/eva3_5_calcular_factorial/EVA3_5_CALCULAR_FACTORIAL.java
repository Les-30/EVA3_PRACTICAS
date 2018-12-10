/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_5_calcular_factorial;

/**
 *
 * @author Peña Hernandez Leslie Johana 18550680 ISC
 */
public class EVA3_5_CALCULAR_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int val = 5;
       int res = calcularFactorial(val);
        System.out.println("RESULTADO = " + res);
    }
    public static int calcularFactorial(int val){
        int res=1;
        
        for (int i = val; i >= 1; i--) {
            res *= i; //RES = RES * i;
            
        }
        
        
        
        return res;
    }
}
