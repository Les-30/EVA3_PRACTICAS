/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_4_funcion;

/**
 *
 * @author temporal2
 */
public class EVA3_4_FUNCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PARA USAR LA FUNCION-->LLAMADA A FUNCION
        EVA3_4_FUNCION objeto = new EVA3_4_FUNCION();
        objeto.imprimeMensaje("Leslie");
        
        Math.random();
    }
    
    
    void imprimeMensaje(String mensaje){
        System.out.println("Hola " + mensaje);
    
    
    }
}
//PARADIGMAS DE PROGRAMACION:
    //PROG. ESTRUCTURADA
    //PROG. MODULAR, ORIENTADA A OBJETOS, A EVENTOS, LOGICA, FUNCIONAL
    //OOP
    //Publico, privado, protegido, default
    //NIVEL DE ACCESO VALOR DE RETORNO, NOMBRE DE LA FUNCION (ARGUMENTOS)
    //{CUERPO DE LA FUNCION}
    //FUNCIONES -->REGRESAN UN VALOR
    //PROCEDIMIENTO --> NO REGRESA NADA