package empleado;

import Clase.Empleado;
import Service.EmpleadoService;

public class main {

   
    public static void main(String[] args) {
       
        EmpleadoService es = new EmpleadoService();
       
        Empleado[] emple = new Empleado[6];
        
        es.crearEmpleado(emple);
        System.out.println(es.promedio(emple));
        es.salarioMayor(emple);
      es.mostrar(es.salarioMayor(emple));
        
        
    }
    
}
//Imagina que tienes una lista de empleados en una pequeña empresa, y deseas
//calcular su salario promedio y saber cuáles empleados tienen un salario
//superior al promedio.
//Para hacer esto, debes crear un objeto de tipo main, cuyos atributos serán
//el nombre y el salario (que representa el salario mensual del empleado). La
//empresa cuenta con solamente 6 empleados, por lo que deberás crear los 6
//objetos main con sus respectivos salarios.
//Una vez creados los empleados, deberás guardarlos en un arreglo de objetos
//tipo main. Utilizando ese arreglo, tendrás que realizar las dos tareas que
//te piden:
//1. Calcular y mostrar el salario promedio de todos los empleados.
//2. Retornar otro arreglo con los nombres de los empleados que tienen un
//salario mayor al promedio.
//Finalmente, debes mostrar todos los empleados con un salario superior al
//promedio.
//Recuerda que para crear un vector de objetos, la definición es la siguiente:
//Objeto nombreVector[] = new Objet