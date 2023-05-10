
package integrador;

import Service.ServiceEstudiante;

public class Integrador {

  
    public static void main(String[] args) {
        ServiceEstudiante n1 = ServiceEstudiante();
        
        n1.crearEstudiante();
        n1.calcularPromedio();
        n1.compararNotas();
        n1.mostrarAlumnos();
        
    }
    
}
