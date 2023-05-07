
package Array;

import Array.Service.ArrayService;


public class Main {

   
    public static void main(String[] args) {
        int[] A = new int[50];  /*declarar como double*/
        int[] B= new int[20];
        
        ArrayService.inicializarA(A);
        
        ArrayService.MostrarArreglo(A);
         System.out.println("************************************");
        ArrayService.OrdenarArreglo(A);
          System.out.println("************************************");
        ArrayService.InicializarB(A, B);
        
    }
    
}
