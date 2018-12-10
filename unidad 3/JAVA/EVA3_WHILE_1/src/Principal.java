
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *@Author Leslie johana peña hernandez 18550680
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner (System.in);
        int sum=0;
        int sumd=0;
        int i=0;
        int numUs;
        int num;
        
        numUs = (int) (Math.random()*14+1);
        sum += numUs;
        System.out.println(numUs);
        
        num = (int) (Math.random()*14+1);
        sumd += num;
        
       while ((sum<=21)&&(sumd<=21)&&(i==0)){
            System.out.println("¿Quieres una carta?");
                String res = Leer.nextLine();
                if (res.equals("si")){
                    numUs = (int) (Math.random()*14+1);
                    System.out.println(numUs);
                    sum += numUs;
                    num = (int) (Math.random()*14+1);
                    sumd += num;
                }else{
                    i=1;
                }
        }
       
       if(sum>21){
           System.out.println("Perdiste");
       }else if(sumd>21){
           System.out.println("Ganaste");
       }else if(sum>sumd){
           System.out.println("Ganaste");
       }else if(sumd>sum){
           System.out.println("Perdiste");
       }
       
    }
    
}
