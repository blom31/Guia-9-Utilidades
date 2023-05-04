
package main;

import FechaService.FechaService;
import java.util.Date;



public class Fecha {

    public static void main(String[] args) {
        
        FechaService fs = new FechaService();
        Date naci = fs.fechaNacimiento();
        
        System.out.println(naci.toString());
        
        Date fechaActual = fs.fechaActual();
        System.out.println(fechaActual.toString());
        
        int edad = fs.dif(naci, fechaActual);
        System.out.println(edad);
    }
    
}
