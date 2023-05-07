package FechaService;

import java.util.Date;
import java.util.Scanner;

public class FechaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
    //Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date
    public Date fechaNacimiento() {
        int dia, mes, anio;

        System.out.print("Por favor ingrese el día de su nac: ");
        dia = leer.nextInt();
        System.out.print("Por favor ingrese el mes de su nac: ");
        mes = leer.nextInt() - 1;
        System.out.print("Por favor ingrese el año de su nac: ");
        anio = leer.nextInt() - 1900;

        return new Date(anio, mes, dia);
    }

    //Método fechaActual que cree un objeto fecha con el día actual. 
    //Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date(); 
    public Date fechaActual() {
        
        return new  Date();
    }
    
    //Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
    
    public int dif(Date fechaNac, Date fechaActual){
        
       //int edad = fechaActual.getYear()-fechaNac.getYear();
       
       /*public int diferencia(Date d1, Date d2) {        método mas simplificado/
        int difAnio = d2.getYear() - d1.getYear();
        int difMes = d2.getMonth() - d1.getMonth();
        int difDia = d2.getDay() - d1.getDay();
        if ((difMes < 0) || ((difMes == 0) && (difDia < 0))) {
            return difAnio - 1;
        } else {
            return difAnio;*/
        
       int dif =0;
        if (fechaNac.getMonth()==fechaActual.getMonth()) {
            if (fechaNac.getDay()<=fechaActual.getDay()) {
                dif=(int)(fechaActual.getYear()-fechaNac.getYear());
                
            }else{
                dif=(int) (fechaActual.getYear()-fechaNac.getYear());
            }
            
        }else if(fechaNac.getMonth()<fechaActual().getMonth()){
            dif=(int)(fechaActual.getYear()-fechaNac.getYear());
        }else{
            dif=(int) (fechaActual.getYear()-fechaNac.getYear());
        }
       
       return dif;
        
    }
}

//Si necesiten acá tienen más información en clase Date: Documentacion Oracle
