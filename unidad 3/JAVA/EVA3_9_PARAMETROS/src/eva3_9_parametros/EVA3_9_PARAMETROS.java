/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_9_parametros;

/**
 *
 * @author temporal2
 */
public class EVA3_9_PARAMETROS { //MAIN --> TIPO DE DATO ABSTRACTO

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PASO POR VALOR --> COPIA DE LOS DATOS (JAVA)
        //PASO POR REFERENCIA --> LA DIRECCION DE LA RAM DONDE ESTAN LOS DATOS
        //REFERENCIA-->APUNTADOR (TIPO DE DATO QUE ALMACENA DIRECCIONES EN MEMORIA)
        //EL SIGNO "&" EN C++ HACE LA REFERENCIA AUTOMATICA.
        System.out.println(new EVA3_9_PARAMETROS());
        int x;
        EVA3_9_PARAMETROS objeto = new EVA3_9_PARAMETROS();
                System.out.println(objeto);
        
     unaclase unobjeto2 = new unaclase();
        System.out.println(unobjeto2);
        
        int valor = 5;
        incrementa(valor);
        System.out.println("EL VALOR ES: " + valor);
        
        
        valor objetovalor = new valor();
        objetovalor.valor1 = 5;
        incrementa(objetovalor);
        System.out.println("EL VALOR 2 ES: " + objetovalor.valor1);
    }
    public static void incrementa(int val){
        val++;
        
    }
     public static void incrementa(valor val2){
     val2.valor1++;
        
    }
    }
class unaclase{
}
 class valor{
 int valor1;
 
 
 }