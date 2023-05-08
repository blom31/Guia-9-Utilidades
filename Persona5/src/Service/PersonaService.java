/*guia 9 */
package Service;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {
     
     
    Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
    
     //Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
//Retornar el objeto Persona creado.
    public Persona crearPersona(){
       
        int dia, mes, anio;
       
        
        System.out.print("Ingrese sun nombre : ");
        String name= leer.next();
        System.out.print("Por favor ingrese el día de su nac: ");
        dia = leer.nextInt();
        System.out.print("Por favor ingrese el mes de su nac: ");
        mes = leer.nextInt() - 1;
        System.out.print("Por favor ingrese el año de su nac: ");
        anio = leer.nextInt() - 1900;
        Date fechaN = new Date();
        
        return new Persona (name, fechaN);
    }
    
    //Método calculala duferecia
    
    public int diferecia(Date fechaNacimiento, Date fechaAct){
        long milisegundoporAnio= 1000L*60*60*24*365;
        long diferenciaMilisegundos = fechaAct.getTime()-fechaNacimiento.getTime();
        int edad = (int)(diferenciaMilisegundos/milisegundoporAnio);
        return edad; 
        
    }

//Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
    public int calcularEdad(Persona persona){
        
        Date fechaAct = new Date();
        
       return diferecia(persona.getFechaN(), fechaAct);
    }
    
    //Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada 
//o false en caso contrario.
    
    public boolean menorQue(Persona persona, int edad){
       int edadPersona = calcularEdad(persona);
       return edadPersona > edad;
       
    }
    //Método mostrarPersona que muestra la información de la persona deseada.
    public void mostrarPersona(Persona persona,int edad ){
        
        System.out.println("La edad de : " + persona.getName()+ " es: " + edad);
}
}


