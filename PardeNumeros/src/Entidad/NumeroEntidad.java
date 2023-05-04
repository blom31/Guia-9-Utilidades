/*dos números reales con los cuales se realizarán diferentes operaciones matemáticas. 
La clase debe tener un constructor vacío, getters y setters.  
En el constructor vacío se usará el Math.random para generar los dos números. Crear una clase ParDeNumerosService
 */
package Entidad;

public class NumeroEntidad {
    
    private int num1;
    private  int num2;

    public NumeroEntidad() {
        
        num1=(int) (Math.random()*10);
        num2= (int)(Math.random()*10);
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    
}
