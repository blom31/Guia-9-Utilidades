
package Service;

import Clase.Estudiante;
import java.util.Scanner;


public class ServiceEstudiante {
    
    private Estudiante[] vectorEstudiantes = new Estudiante[8]();
    
    public Estudiante[] crearEstudiante(){
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         
         System.out.println("Ingrese el nombre y la nota");
         String name = leer.nextLine();
         double nota = leer.nextDouble();
         
        return null;
        
        
    }
    
    
    public void calcularPromedio(){
        double sumaNotas=0;
        
        for (Estudiante vectorEstudiante:vectorEstudiantes){
            sumaNotas+=vectorEstudiante.getnota();
        }
        promedioDeClase = sumanotas/vectorEstudiante.legth;
      //  System.out.println("El promedio de las notas es: " + promedioDeClase);
    }
    return promedioDeClase;
    
    public void compararNotas(){
        int contNotas=0;
        double promedioCalculado=calcularPromedio;
        for (int i = 0; i < vector.Estudiante.lenght; i++) {
            if (calcularPromedio()<=vectorEstudiante[i].getNota()) {
                contNotas++;
            }
        }
        String[] nombresAlumnos = new String[contNotas];
        
        for (int i = 0; i < vector.EStudiantes.length; i++) {
            if (promedioCalculado()<=vectorEstudiantes[i]getNota())
            nombreAlumnos[i]+= vectorEstudiantes[i].getNombre()
                    
                
            }
        }
    }
    
public void mostrarAlumnos(compararNotas){
    Arrays.toString(compararNotas()); 
}
