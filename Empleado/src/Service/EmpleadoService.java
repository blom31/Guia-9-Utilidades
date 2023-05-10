package Service;

import Clase.Empleado;
import java.util.Arrays;
import java.util.Scanner;

public class EmpleadoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Empleado[] crearEmpleado(Empleado[] emple) {

        for (int i = 0; i < emple.length; i++) {
            System.out.println("Registre el empleado nro: " + (i+1));
            String nombre = leer.next();
            System.out.println("Ingrese el salario de " + nombre);
            double salario = leer.nextDouble();
            Empleado empleado = new Empleado(nombre, salario);
            emple[i] = empleado;
        }
        return emple;
    }

    //1. Calcular y mostrar el salario promedio de todos los empleados.
    public double promedio(Empleado[] emple) {

        double prom, cont = 0;
        for (int i = 0; i < emple.length; i++) {
            cont += emple[i].getSalario();
        }
        prom = cont / emple.length;
        return prom;
    }
    //Retornar otro arreglo con los nombres de los empleados que tienen un
//salario mayor al promedio.

    public String[] salarioMayor(Empleado[] emple) {

        double promedio = promedio(emple);
        int cont = 0, indice = 0;
        for (int i = 0; i < emple.length; i++) {
            if (emple[i].getSalario() > promedio) {
                cont++;
            }
        }
        String[] salarioM = new String[cont];

        for (int i = 0; i < emple.length; i++) {
            if (emple[i].getSalario() > promedio) {
                salarioM[indice] = emple[i].getName();
                indice++;
            }
        }
        return salarioM;

    }
    
    public void mostrar(String[] salarioM){
        
        System.out.println(Arrays.toString(salarioM));
    }
    
}
//Imagina que tienes una lista de empleados en una pequeña empresa, y deseas
//calcular su salario promedio y saber cuáles empleados tienen un salario
//superior al promedio.
//Para hacer esto, debes crear un objeto de tipo Empleado, cuyos atributos serán
//el nombre y el salario (que representa el salario mensual del empleado). La
//empresa cuenta con solamente 6 empleados, por lo que deberás crear los 6
//objetos Empleado con sus respectivos salarios.
//Una vez creados los empleados, deberás guardarlos en un arreglo de objetos
//tipo Empleado. Utilizando ese arreglo, tendrás que realizar las dos tareas que
//te piden:
//1. Calcular y mostrar el salario promedio de todos los empleados.
//2. Retornar otro arreglo con los nombres de los empleados que tienen un
//salario mayor al promedio.
//Finalmente, debes mostrar todos los empleados con un salario superior al
//promedio.
//Recuerda que para crear un vector de objetos, la definición es la siguiente:
//Objeto nombreVector[] = new Objet
