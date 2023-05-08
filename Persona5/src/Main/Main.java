/*guia 9*/
package Main;

import Entidad.Persona;
import Service.PersonaService;


public class Main {


    public static void main(String[] args) {
       
        PersonaService ps = new PersonaService();
        Persona persona1 = ps.crearPersona();
        System.out.println("*** Datos del Objeto");
        System.out.println(persona1.toString());
        ps.calcularEdad(persona1);
        int edad = ps.calcularEdad(persona1);
        System.out.println(edad);
        int edadComp = 18;
        System.out.println(ps.menorQue(persona1, edadComp));
        ps.mostrarPersona(persona1, edad);
    }
    
}
