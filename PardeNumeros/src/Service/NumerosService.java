/*Previamente se deben redondear ambos valores. 
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

 */
package Service;

import Entidad.NumeroEntidad;

public class NumerosService {
    
    public static void mostrarValores(NumeroEntidad numero){//Método mostrarValores que muestra cuáles son los dos números guardados.
        
        System.out.println("El num 1 es " + numero.getNum1());
        System.out.println("El num 2 es " + numero.getNum2());
        
    }
    
    public static int devolverMayor(NumeroEntidad numero){//Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor 
        int mayor;
        
        mayor= Math.max(numero.getNum1(),numero.getNum2());
       System.out.println("el numero mayor es " + mayor);
        return mayor;
        
    }
    //Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número.
    public static void calcularPotencia(NumeroEntidad numero){

        int minimo;
        int result;
        
        minimo= Math.min(numero.getNum1(),numero.getNum2());
        
        result = (int) Math.pow(devolverMayor(numero),minimo);
        System.out.println("La potencia es " + result);        
    }
        //Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
        //Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    
    public static void calculaRaiz(NumeroEntidad numero){
    
         int minimo= Math.abs(Math.min(numero.getNum1(),numero.getNum2()));
         
         double raiz = Math.sqrt(minimo);
     
        System.out.println("La raiz del minimo es " + raiz);
     }
    }
