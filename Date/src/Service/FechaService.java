package Service;

import java.util.Date;
import java.util.Scanner;

public class FechaService {
    
//Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
//Luego los pase por parámetro a un nuevo objeto main. El método debe retornar el objeto main. 
//Ejemplo fecha: main fecha = new main(anio, mes, dia);
    
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     
    public Date fechanac() {
        System.out.println("Ingrese la fecha de nacimiento \n"
                + "día\n"
                + "-mes\n"
                + "-año");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int year = leer.nextInt();
        return new Date(year, mes, dia);
    }
     
}



/*Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase main. Ejemplo: main fechaActual = new  main();
El método debe retornar el objeto main.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase main*/