
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leslie Peña Hernandez 18550680
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner (System.in);
        String user = "Leslie";
        String pass = "LeslieP";
        int iCont=0;
        boolean enter=false;
        
        while((iCont<=2)&&(!enter)){
            System.out.println("Usuario");
                String us = Leer.nextLine();
            System.out.println("Contraseña");
                String con = Leer.nextLine();
            if((us.equals(user))&&(con.equals(pass))){
                iCont ++;
                enter=true;
            }else{
                System.out.println("Datos incorrectos");
                iCont ++;
            }
                
        }
        
        if(enter){
            System.out.println("Bienvenido");
        }else{
            System.out.println("Acceso denegado");
        }
        
    }
    
}
