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
    
    public int calcularEdad(Persona persona){
        
        
        
        
    }
}
//Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:

//Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
//Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada 
//o false en caso contrario.
//Método mostrarPersona que muestra la información de la persona deseada.
