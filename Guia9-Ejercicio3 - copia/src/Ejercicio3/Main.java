
package Ejercicio3;

import Ejercicio3.Servicio.ArregloService;


public class Main {

   
    public static void main(String[] args) {
        int[] A = new int[50];
        int[] B= new int[20];
        
        ArregloService.inicializarA(A);
        
        ArregloService.MostrarArreglo(A);
         System.out.println("************************************");
        ArregloService.OrdenarArreglo(A);
          System.out.println("************************************");
        ArregloService.InicializarB(A, B);
        
    }
    
}
