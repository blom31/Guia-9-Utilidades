package main;


import Entidad.Cadena;
import Service.CadenaService;


public class main {

    public static void main(String[] args) {
        
        CadenaService cs = new CadenaService();
        
        Cadena mifrase = cs.leerFrase();
        
        
        
       cs.contarVocales(mifrase);
        
        cs.fraseInvertida(mifrase);
        
        cs.vecesRepetido(mifrase);
        
        cs.compararLogitud(mifrase);
        
        cs.unirFrase(mifrase);
        
        cs.reemplazar(mifrase);
        
        cs.contiene(mifrase);
        
        
        
        
        
    }
    
}
