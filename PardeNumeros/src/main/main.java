/*
 */
package main;

import Entidad.NumeroEntidad;
import Service.NumerosService;



public class main {


    public static void main(String[] args) {
        
        NumeroEntidad numeropar = new NumeroEntidad();
        NumerosService.mostrarValores(numeropar);
        NumerosService.devolverMayor(numeropar);
        NumerosService.calcularPotencia(numeropar);
        NumerosService.calculaRaiz(numeropar);
        
    }
    
}
